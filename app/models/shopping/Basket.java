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
    
    // Add item for sale to basket
    // Either update existing order item or ad a new one.
    public void addProductOnSale(ProductOnSale product) {
        
        boolean productFound = false;
        // Check if product already in this basket
        // Check if item in basket
        // Find orderitem with this product
        // if found increment quantity
        for (OrderProduct oi : basketProducts) {
            if (oi.getProduct().getId() == product.getId()) {
                oi.increaseQty();
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
    
    public void removeProduct(OrderProduct product, ProductOnSale pos) {

        for (Iterator<OrderProduct> iter = basketProducts.iterator(); iter.hasNext();) {
            OrderProduct i = iter.next();
            if (i.getId().equals(product.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getStock() > 1 ) {
                    i.decreaseQty(); 
                    pos.incrementStock(); 
                    pos.update();                          
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    pos.incrementStock(); 
                    pos.update();         
                    // remove object from list
                    iter.remove();
                    break;
                }             
            }
		}
    }
    
    public void removeAllProducts() {
        for(OrderProduct i: this.basketProducts) {
            ProductOnSale ios = ProductOnSale.find.byId(i.getProduct().getId());
            if(ios.getId() == i.getProduct().getId())
            {
                int stock = i.getStock();
                ios.incrementStock(stock);
                ios.update();
            } 
            i.delete();
        }
        this.basketProducts = null;
    }

    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderProduct i: basketProducts) {
            total += i.getProductTotal();
        }
        return total;
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

    public List<OrderProduct> getBasketProducts() {
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
            
}