package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Role {

    private long id;
    private String Authority;

}
