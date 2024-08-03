package com.tutorialspring.webservice.repositories;

import com.tutorialspring.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {
}
