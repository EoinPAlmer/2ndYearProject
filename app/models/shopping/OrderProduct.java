package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

// OrderItem entity managed by Ebean
@Entity
public class OrderProduct extends Model {

    @Id
    private Long id;

    @ManyToOne
    private ShopOrder order;
    
    @ManyToOne
    private Basket basket;
    
    // Unidirection mapping - Many order items can have one product
    // Product not interested in this
    @ManyToOne
    private ProductOnSale product;
    
    private int stock;
    private double price;

    // Default constructor
    public  OrderProduct() {
    }
    
    public OrderProduct(ProductOnSale ios) {
            product = ios;
            stock = 1;
            price = ios.getPrice();
    }
    
    // Increment quantity
    public void increaseQty() {
        stock += 1;
    }
    
    // Decrement quantity
    public void decreaseQty() {
        stock -= 1;
    }
    
    // Calculate and return total price for this order item
    public double getProductTotal() {
        return this.price * this.stock;
    }
	
	//Generic query helper
    public static Finder<Long,OrderProduct> find = new Finder<Long,OrderProduct>(OrderProduct.class);

    //Find all Products in the database
    public static List<OrderProduct> findAll() {
        return OrderProduct.find.all();
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

    public void setProduct(ProductOnSale product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}