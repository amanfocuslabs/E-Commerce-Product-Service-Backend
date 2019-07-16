package com.ea.ecommerceproductservicebackend.controller;

import com.ea.ecommerceproductservicebackend.model.Product;
import com.ea.ecommerceproductservicebackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/product")
public class ProductController {
    @Autowired
    public ProductService productService;

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
}
