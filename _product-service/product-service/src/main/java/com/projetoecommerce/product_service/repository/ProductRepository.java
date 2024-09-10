package com.projetoecommerce.product_service.repository;

import com.projetoecommerce.product_service.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
