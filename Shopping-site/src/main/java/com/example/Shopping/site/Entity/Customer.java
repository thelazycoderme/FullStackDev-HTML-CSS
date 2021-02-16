package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer extends User{
    //foreign key
private long user_id;
private String contact;

}
