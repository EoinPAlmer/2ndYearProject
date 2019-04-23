package models.users;


import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.*;


@Table(name = "user")
// This is a Customer of type user
@DiscriminatorValue("c")

@Entity
public class UserPassword2 extends User {
    private String password2;


    // Customer has one basket.
    // Customer is the owner (foreign key will be added to Basket table)
    // All changes to Customer are cascaded.
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;

    // Customer can have many ShopOrders.
    // Customer is the owner (forieng key will be added to Basket table)
    // All changes to Customer are cascaded
    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;


    public UserPassword2(){

    }

    public UserPassword2(String email, 
            String name, String role,String password1, String password2) {
        super(email, name,role, password1);
        this.password2 = password2;
    }

    public String getPassword2(){
        return password2;
    }

    public void setPassword2(String p){
        this.password2 = p;
    }

    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
			    
    public static final List<Customer> findAll() {
       return Customer.find.all();
    }
    public Basket getBasket() {
        return basket;
    }

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
}





}