package com.tutorialspring.webservice.repositories;

import com.tutorialspring.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
