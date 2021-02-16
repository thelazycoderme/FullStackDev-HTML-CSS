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
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    //foreign key
    private long parent_id;

}
