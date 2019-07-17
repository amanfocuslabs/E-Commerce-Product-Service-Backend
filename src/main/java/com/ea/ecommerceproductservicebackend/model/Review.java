package com.ea.ecommerceproductservicebackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
public class Review {
    private Long id;
    private Date date;
    private String content;
    private Double rating;
    private Long accountId;
    private Long productId;

}
