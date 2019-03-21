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
    
    private int quantity;
    private double price;

    @ManyToOne
private ShopOrder order;

@ManyToOne
private Basket basket;

// Unidirection mapping - Many order items can have one product
// Product not interested in this
@ManyToOne
private ProductOnSale product;


    // Default constructor
    public  OrderProduct() {
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
    public double getProductTotal() {
        return this.price * this.quantity;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<OrderProduct> getBasketProducts() {
        return basketProducts;
    }

    public void setBasketProducts(List<OrderProductm> basketProducts) {
        this.basketProducts = basketProducts;
    }

	public OrderProduct(ProductOnSale pos) {
        product = pos;
        quantity = 1;
        price = ios.getPrice();
    }
    public List<OrderProduct> getProducts() {
        return products;
    }

    public void setProducts(List<OrderProduct> Products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

