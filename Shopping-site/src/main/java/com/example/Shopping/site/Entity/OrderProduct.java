package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrderProduct {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
//    @ManyToOne
//    @JoinColumn(name="order_id")
//    private Order order;
    private int quantity;
    private double price;
    //foreign key
//    @ManyToMany
//    @JoinColumn(name = "product_variation_id")
//    private Product_variation product_variation;

    private String product_variation_metadata;
}