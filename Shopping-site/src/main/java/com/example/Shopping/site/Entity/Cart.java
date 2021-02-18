package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cart {

    @Id
    private Long id;
    //foreign key
//    @OneToOne
//    @JoinColumn(name = "customer_user_id")
   // private Customer customer;
    private Double quantity;
    private Boolean isWish_item;
    //foreign key


    @OneToMany(mappedBy = "cart",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<ProductVariation> product_variation;


}
