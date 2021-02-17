package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;
//    @ManyToOne
//    @JoinColumn(name="seller_user_id")
//    private Seller seller;
    @ManyToOne(optional = false)
    @JoinColumn(name = "products")
    Category category;


    private String name;
    private String description;
    private boolean is_cancellable;
    private boolean is_returnable;
    private String brand;
    private boolean isActive;


}
