package com.example.Shopping.site.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryMetadataFieldValuesId implements Serializable{
    @Column(name = "categoryId")
    private Long cid;

    @Column(name = "categoryMetadataId")
    private Long mid;


}
