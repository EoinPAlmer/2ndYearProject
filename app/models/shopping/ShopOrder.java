package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Date;

import models.products.*;
import models.users.*;

// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Date orderDate;
    
    // Order contains may items.
    // mappedBy makes this side of the mapping the owner
    // so foreign key will be placed in resulting OrderItem table
    // All changes, including deletes will be cascaded
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderProduct> products;
    
    @ManyToOne
    private Customer customer;

    // Default constructor
    public  ShopOrder() {
        orderDate = new Date();
    }
    
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderProduct i: products) {
            total += i.getProductTotal();
        }
        return total;
    }
	
	//Generic query helper
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

    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}