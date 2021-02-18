package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.parameters.P;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductReview {
    @Id@GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customerUserId")
    private Customer customer;

    private String review;
    private String rating;

    @ManyToOne
    @JoinColumn(name = "productId")
    Product product;

}
