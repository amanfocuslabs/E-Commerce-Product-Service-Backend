package com.ea.ecommerceproductservicebackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Enumerated(EnumType.STRING)
    private CategoryName categoryName;
    @OneToMany(mappedBy ="productCategory" )
    private List<Product> productList =new ArrayList<>();
}
