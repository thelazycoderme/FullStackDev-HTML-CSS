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
public class Cart {

    @Id
    //foreign key
    private long customer_user_id;
    private double qunatity;
    private boolean isWish_item;
    //foreign key
    private long product_variation_id;
}
