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
    private Long id;
    //foreign key
    @ManyToOne
    @JoinColumn(name="orderId")
    private Orders orders;

    @OneToOne
    OrderStatus orderStatus;

    private Integer quantity;
    private Double price;
    //foreign key
    @ManyToOne
    @JoinColumn(name = "productVariationId")
    private ProductVariation productVariation;

    private String product_variation_metadata;
}