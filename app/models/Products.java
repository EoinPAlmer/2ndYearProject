package models;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
public class Products extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String brand;
    @Constraints.Required
    private int size;
    @Constraints.Required
    private int stock;
    @Constraints.Required
    private double price;

    @ManyToOne
    private Category category;


    public Products() {
    }

    public Products(Long id, String name, String brand, int size, int stock, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.stock = stock;
        this.price = price;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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

    public static Finder<Long,Products> find = new Finder<Long,Products>(Products.class);

    public Category getCategory() {
        return category;
    }

    public static List<Products> findAll(){
        return Products.find.all();
    }
}