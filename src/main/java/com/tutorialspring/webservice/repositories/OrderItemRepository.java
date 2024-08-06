package com.tutorialspring.webservice.repositories;

import com.tutorialspring.webservice.entities.OrderItem;
import com.tutorialspring.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
