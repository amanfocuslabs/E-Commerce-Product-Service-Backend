package com.ea.ecommerceproductservicebackend.dao;

import com.ea.ecommerceproductservicebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
