package com.ea.ecommerceproductservicebackend.controller;

import com.ea.ecommerceproductservicebackend.model.Product;
import com.ea.ecommerceproductservicebackend.model.Review;
import com.ea.ecommerceproductservicebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/product")
public class ProductController {
    @Autowired
    public ProductService productService;
    @Autowired
    private RestTemplate restTemplate;

    private String reviewUrl="http://review-service:8089/rest/review/";

    @GetMapping("/")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return  productService.getProduct(id);
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.add(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable long id) {
        productService.delete(id);
        return true;
    }
    @GetMapping("/reviews/{id}")
    public List<Review> getReviews(@PathVariable Long id) {
        ResponseEntity<List<Review>> response = restTemplate.exchange(reviewUrl+"getReviewByProduct/"+id,
                HttpMethod.GET,null,new ParameterizedTypeReference<List<Review>>(){});
        List<Review> productReview = response.getBody();
        return productReview;
    }
}
