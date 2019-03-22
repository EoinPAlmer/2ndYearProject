package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;



// Product entity managed by Ebean
@Entity
public class Basket extends Model {

@Id
private Long id;


@OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
private List<OrderProduct> basketProducts;

@OneToOne
private Customer customer;

    
    // Default constructor
    public  Basket() {
    }
    
	
   //Generic query helper
    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    //Find all Products in the database
    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderProduct> getBasketProduct() {
        return basketProducts;
    }

    public void setBasketProducts(List<OrderProduct> basketProducts) {
        this.basketProducts = basketProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }


    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addProductOnSale(ProductOnSale product) {
        
        boolean productFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderProduct op : basketProduct) {
            if (op.getProduct().getId() == product.getId()) {
                op.increaseQty();
                productFound = true;
                break;
            }
        }
        if (productFound == false) {
            // Add orderItem to list
            OrderProduct newProduct = new OrderProduct(Product);
            // Add to items
            basketProduct.add(newProduct);
        }
    }

    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderProduct p: basketProducts) {
            total += p.getProductTotal();
        }
        return total;
    }

    public void removeProduct(OrderProduct product) {

        // Using an iterator ensures 'safe' removal of list objects
        // Removal of list items is unreliable as index can change if an item is added or removed elsewhere
        // iterator works with an object reference which does not change
        for (Iterator<OrderProduct> iter = basketProducts.iterator(); iter.hasNext();) {
            OrderProduct i = iter.next();
            if (i.getId().equals(product.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    // remove object from list
                    iter.remove();
                    break;
                }             
            }
       }
    }

    public void removeAllProducts() {
        for(OrderProduct p: this.basketProducts) {
            i.delete();
        }
        this.basketProducts = null;
    }
    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addProductOnSale(ProductOnSale product) {
        
        boolean productFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderProduct op : basketProducts) {
            if (op.getProduct().getId() == product.getId()) {
                op.increaseQty();
                productFound = true;
                break;
            }
        }
        if (productFound == false) {
            // Add orderItem to list
            OrderProduct newProduct = new OrderProduct(product);
            // Add to items
            basketProducts.add(newProduct);
        }
    }

}
