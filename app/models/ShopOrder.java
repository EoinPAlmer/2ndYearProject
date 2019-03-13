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


// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;    
    private Date orderDate;
    

    // Default constructor
    public  ShopOrder() {
        orderDate = new Date();
    }
    	
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        orderDate = orderDate;
    }
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
}