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
public class Order_product {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
    private long order_id;
    private int quantity;
    private double price;
    //foreign key
    private long product_variation_id;
    private String product_variation_metadata;
}