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
public class Product_variation {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
    private long product_id;
    private double quantity_avialable;
    private double price;
    //json value from categorey table

    //private json metadata
    private String primary_image_name;
    private boolean is_active;
}