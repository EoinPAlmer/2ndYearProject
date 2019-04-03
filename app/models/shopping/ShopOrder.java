package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Date;

import models.products.*;
import models.users.*;
import java.text.SimpleDateFormat;
// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    private Calendar orderDate;
    
 
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderProduct> products;
    
    @ManyToOne
    private Customer customer;

    // Default constructor
    public  ShopOrder() {
        orderDate = Calendar.getInstance();
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

    public Calendar getOrderDate() {
        return orderDate;
    }
    public String getOrderDateString() {
        if(orderDate == null) {
            return "No Date Availible";
        }
        String s = new SimpleDateFormat("dd-MMM-yyyy").format(orderDate.getTime());
        return s;
    }

    public void setOrderDate(Calendar orderDate) {
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
    public void adjustStock(){
        for (OrderProduct i : products) {
            ProductOnSale ios = ProductOnSale.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == ios.getId()) {
                int stock = i.getStock();
                ios.incrementStock(stock);
                ios.update();
            }
        }
    }
}