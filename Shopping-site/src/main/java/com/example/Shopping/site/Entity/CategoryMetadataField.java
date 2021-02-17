package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CategoryMetadataField {
   @Id
   @GeneratedValue
    private long id;
    private String name;
//
    @OneToMany(mappedBy = "categoryMetadataField")
    List<CategoryMetadataFieldValues> category_metadataFieldValuesList =new ArrayList<>();


}
