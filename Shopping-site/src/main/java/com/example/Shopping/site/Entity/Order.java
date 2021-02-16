package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Order {
    @Id
    @GeneratedValue
    private long id;
    //foreign key
    private long customer_user_id;
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
