package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
    private long seller_user_id;
    private String name;
    private String description;
    private boolean is_cancellable;
    private boolean is_returnable;
    private String brand;
    private boolean isActive;

}
