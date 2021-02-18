package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.loader.custom.FetchReturn;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductVariation {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "productVariationId")
    private Cart cart;

    @OneToMany(mappedBy = "productVariation",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    Set<OrderProduct> orderProductSet;


    private Double quantity_avialable;
    private Double price;
    //json value from categorey table

    //private json metadata
    private String primary_image_name;
    private Boolean is_active;
}