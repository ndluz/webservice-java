package com.tutorialspring.webservice.services;

import com.tutorialspring.webservice.entities.Category;
import com.tutorialspring.webservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> category = repository.findById(id);
    return category.get();
  }
}
