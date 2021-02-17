package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cart {

    @Id
    private long id;
    //foreign key
//    @OneToOne
//    @JoinColumn(name = "customer_user_id")
   // private Customer customer;
    private double quantity;
    private boolean isWish_item;
    //foreign key
//    @OneToOne
//    @JoinColumn(name = "product_variation_id")
   // private Product_variation product_variation;
}
