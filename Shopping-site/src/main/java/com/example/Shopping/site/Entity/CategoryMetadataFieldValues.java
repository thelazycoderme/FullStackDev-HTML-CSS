package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CategoryMetadataFieldValues implements Serializable {

    @EmbeddedId()
    private CategoryMetadataFieldValuesId categoryMetadataFieldValuesId;

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryMetadataFieldId",insertable = false,updatable = false,nullable = false)
    private CategoryMetadataField categoryMetadataField;


    @ManyToOne(optional = false)
    @JoinColumn(name = "categoryId",insertable = false,updatable = false,nullable = false)
    private Category category;


    //values comma separated

}
