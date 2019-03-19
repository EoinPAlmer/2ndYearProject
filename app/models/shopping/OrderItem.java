package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

@ManyToOne
    private ShopOrder order;
    
    @ManyToOne
    private Basket basket;
    
    // Unidirection mapping - Many order items can have one product
    // Product not interested in this
    @ManyToOne
    private ItemOnSale item;


// OrderItem entity managed by Ebean
@Entity
public class OrderItem extends Model {

    @Id
    private Long id;
    
    private int quantity;
    private double price;

    // Default constructor
    public  OrderItem() {
    }
    
    
    // Increment quantity
    public void increaseQty() {
        quantity += 1;
    }
    
    // Decrement quantity
    public void decreaseQty() {
        quantity -= 1;
    }
    
    // Calculate and return total price for this order item
    public double getItemTotal() {
        return this.price * this.quantity;
    }
	
   //Generic query helper
    public static Finder<Long,OrderItem> find = new Finder<Long,OrderItem>(OrderItem.class);

    //Find all Products in the database
    public static List<OrderItem> findAll() {
        return OrderItem.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	public OrderItem(ItemOnSale ios) {
        item = ios;
        quantity = 1;
        price = ios.getPrice();
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

