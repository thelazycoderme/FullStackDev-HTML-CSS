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
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String city;
    private String state;
    private String contry;
    private String Address_line;
    private String zip_code;
    private String label;
    private String user_id;

}
