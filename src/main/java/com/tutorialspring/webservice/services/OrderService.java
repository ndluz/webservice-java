package com.tutorialspring.webservice.services;

import com.tutorialspring.webservice.entities.Order;
import com.tutorialspring.webservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    return repository.findAll();
  }

  public Order findById(Long id) {
    Optional<Order> user = repository.findById(id);
    return user.get();
  }
}
