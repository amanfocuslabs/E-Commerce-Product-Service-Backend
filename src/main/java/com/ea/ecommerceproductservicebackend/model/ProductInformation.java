package com.ea.ecommerceproductservicebackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@Data
@Embeddable
public class ProductInformation {
    private String productDimensions;
    private String itemWeight;
    private String manufacturer;
    private String itemModelNumber;
}
