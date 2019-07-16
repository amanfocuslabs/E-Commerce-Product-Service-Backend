package com.ea.ecommerceproductservicebackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    private String productName;
    private String shortProductDescription;
    private Long price;
    private String imageURL;
    //    private Integer stokeAmount;
    @Embedded
    private ProductInformation productInformation;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProductCategory productCategory;
}
