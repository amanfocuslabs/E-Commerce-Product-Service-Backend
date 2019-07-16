package com.ea.ecommerceproductservicebackend.service;

import com.ea.ecommerceproductservicebackend.dao.ProductRepository;
import com.ea.ecommerceproductservicebackend.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();

    }
    public Product getProduct(Long id){
        return productRepository.findById(id).get();
    }
    public Product add(Product product){
        return productRepository.save(product);
    }
    public Product update(Product product){
        return productRepository.save(product) ;
    }
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

}
