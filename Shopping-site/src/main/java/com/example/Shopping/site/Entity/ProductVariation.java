package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductVariation {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    Product product;
    private double quantity_avialable;
    private double price;
    //json value from categorey table

    //private json metadata
    private String primary_image_name;
    private boolean is_active;
}