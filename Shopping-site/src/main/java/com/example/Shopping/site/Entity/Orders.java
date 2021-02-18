package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Long id;
    //foreign key
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="customerUserId")
    private Customer customer;

    @OneToMany(mappedBy ="orders",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<OrderProduct> ordersSet;


    private String amount_paid;
    private Date date_created;
    private String payment_method;
    private String customer_address_city;
    private String customer_address_state;
    private String customer_address_country;
    private String customer_address_address_line;
    private String customer_address_zip_code;
    private String customer_address_label;

}
