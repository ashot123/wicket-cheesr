package cheers.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cheese")
public class Cheese implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public Cheese() {
    }

    /*public Cheese(String name, String description, double price) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
    }*/

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}
