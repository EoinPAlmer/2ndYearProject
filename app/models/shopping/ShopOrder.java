package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;


// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;    
    private Date orderDate;
    
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderProduct> products;
    
    @ManyToOne
    private Customer customer;
    
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

    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public ProductOnSale getProduct() {
        return product;
    }

    public void setProduct(ProductOnSale productm) {
        this.product = product;
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
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderProduct p: products) {
            total += i.getProductTotal();
        }
        return total;
    }
}