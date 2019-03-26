package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

// Import models
import models.users.*;
import models.products.*;
import models.shopping.*;

@Security.Authenticated(Secured.class)
// Authorise user (check if user is a customer)
@With(CheckIfCustomer.class)

public class ShoppingCtrl extends Controller {

    private FormFactory formFactory;
    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }
    // View an individual order
    @Transactional
    public Result viewOrder(long id) {
        ShopOrder order = ShopOrder.find.byId(id);
        return ok(orderConfirmed.render((Customer)User.getUserById(session().get("email")), order));
    }
    @Transactional
    public Result addToBasket(Long id) {
        
        // Find the item on sale
        ProductOnSale product = ProductOnSale.find.byId(id);
        
        // Get basket for logged in customer
        Customer customer = (Customer)User.getUserById(session().get("email"));
        
        // Check if item in basket
        if (customer.getBasket() == null) {
            // If no basket, create one
            customer.setBasket(new Basket());
            customer.getBasket().setCustomer(customer);
            customer.update();
        }
        // Add product to the basket and save
        customer.getBasket().addProductOnSale(product);
        customer.update();
        
        // Show the basket contents     
        return ok(basket.render(customer));
    }
    @Transactional
    public Result emptyBasket() {
        
        Customer c = (Customer)User.getUserById(session().get("email"));
        c.getBasket().removeAllProducts();
        c.getBasket().update();
        
        return ok(basket.render(c));
    }
    @Transactional
    public Result placeOrder() {
        Customer c = (Customer)User.getUserById(session().get("email"));
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setCustomer(c);
        
        // Copy basket to order
        order.setProducts(c.getBasket().getBasketProducts());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderProduct i: order.getProducts()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        c.getBasket().setBasketProducts(null);
        c.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(c, order));
    }
    @Transactional
    public Result showBasket() {
        return ok(basket.render((Customer)User.getUserById(session().get("email"))));
    }
    // Add an item to the basket
    @Transactional
    public Result addOne(Long productId) {
        
        // Get the order item
        OrderProduct product = OrderProduct.find.byId(productId);
        // Increment quantity
        product.increaseQty();
        // Save
        product.update();
        // Show updated basket
        return redirect(routes.ShoppingCtrl.showBasket());
    }

    @Transactional
    public Result removeOne(Long productId) {
        
        // Get the order item
        OrderProduct product = OrderProduct.find.byId(productId);
        // Get user
        Customer c = (Customer)User.getUserById(session().get("email"));
        // Call basket remove item method
        c.getBasket().removeProduct(product);
        c.getBasket().update();
        // back to basket
        return ok(basket.render(c));
    }

}
