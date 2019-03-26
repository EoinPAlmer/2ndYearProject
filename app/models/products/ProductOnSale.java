package models.products;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class ProductOnSale extends Model {

    // Properties
    @Id
    private Long id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String brand;
    @Constraints.Required
    private int stock;
    @Constraints.Required
    private double price;

    @ManyToMany(cascade=CascadeType.ALL, mappedBy = "products")
    private List<Category> categories;

    private List<Long> catSelect = new ArrayList<Long>();

    // Default Constructor
    public ProductOnSale() {
    }

    // Constructor to initialise object
    public ProductOnSale(Long id, String name, String brand, int stock, double price, int size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.stock = stock;
        this.price = price;
        this.size = size;
    }

    public static final Finder<Long, ProductOnSale> find = new Finder<>(ProductOnSale.class);
			    
    public static final List<ProductOnSale> findAll() {
        return ProductOnSale.find.all();
    }

    // Accessor methods
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
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

public List<Category> getCategories() {
    return categories;
}
public void setCategories(List <Category> categories) {
    this.categories = categories;
}
public List<Long> getCatSelect() {
    return catSelect;
}
public void setCatSelect(List<Long> catSelect) {
    this.catSelect = catSelect;
}
}