package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
//    @ManyToOne
//    @JoinColumn(name="customer_user_id")
//    private Customer customer;

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
