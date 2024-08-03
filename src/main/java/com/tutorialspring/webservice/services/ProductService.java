package com.tutorialspring.webservice.services;

import com.tutorialspring.webservice.entities.Product;
import com.tutorialspring.webservice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    List<Product> products = repository.findAll();
    return this.repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> product = repository.findById(id);
    return product.get();
  }
}
