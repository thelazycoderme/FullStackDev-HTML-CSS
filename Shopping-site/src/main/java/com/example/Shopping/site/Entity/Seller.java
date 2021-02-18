package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Seller extends User {

    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    private Set<Product> products;


    private String gst;
    private String Company_contact;
    private String Company_name;


}
