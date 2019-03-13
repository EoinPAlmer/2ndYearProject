package models;

import play.db.ebean.Transactional;
import play.api.Environment;

import java.util.*;
import javax.persistence.*;


import play.data.format.*;
import play.data.validation.*;

import models.Products.*;
import models.User.*;
import models.Customer.*;
import com.avaje.ebean.Model;



// Product entity managed by Ebean
@Entity
public class Basket extends Model {

    @Id
    private Long id;
    
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

    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }
    public void removeItem(OrderItem item) {

        
        // Removal of list items is unreliable as index can change if an item is added or removed elsewhere
        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
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

       public void removeAllItems() {
        for(OrderItem i: this.basketItems) {
            i.delete();
        }
        this.basketItems = null;
    }
    }
}