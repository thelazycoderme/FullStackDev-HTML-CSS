package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductReview {
    @Id
    //foreign key
    private int customer_user_id;
    private String review;
    private String rating;
    //foreign key;
    private long product_id;

}
