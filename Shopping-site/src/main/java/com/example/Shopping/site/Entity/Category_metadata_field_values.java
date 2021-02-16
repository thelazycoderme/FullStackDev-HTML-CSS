package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Category_metadata_field_values {
    //foreign key
    private long category_metadata_field_id;

    //foreign key
    private long category_id;

    //values comma separated

}
