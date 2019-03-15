package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer extends  User {

    //Attributes
    @Id
    private String email;
    @Constraints.Required
    private String role;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String password;

    public Customer(){
    }

    public static Finder<String,User> find = new Finder<String,User>(User.class);

    public static List<User> findAll(){
        return User.find.all();
    }

    public static User authenticate(String email,String password){
        return find.where().eq("email",email).eq("password",password).findUnique();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public static User getUserById(String id){
        if (id == null){
            return null;
        }else{
            return find.byId(id);
        }
    }
    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Basket basket;

@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;
}