package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
public class UserRole {
    @Id
    @GeneratedValue
    private long id;
    //foreign key 1
    //@ManyToOne

}
