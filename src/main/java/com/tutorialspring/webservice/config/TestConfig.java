package com.tutorialspring.webservice.config;

import com.tutorialspring.webservice.entities.User;
import com.tutorialspring.webservice.entities.Order;
import com.tutorialspring.webservice.entities.enums.OrderStatus;
import com.tutorialspring.webservice.repositories.OrderRepository;
import com.tutorialspring.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(null, "Anderson", "anderson@mail.com", "1231232342", "dfasdfasdf");
    User u2 = new User(null, "Nosredna", "nosredna@mail.com", "423243234", "asdfasdfdfd");

    Order o1 = new Order(null, Instant.parse("2024-06-20T16:45:09Z"), OrderStatus.SHIPPED, u1);
    Order o2 = new Order(null, Instant.parse("2024-10-20T12:57:02Z"), OrderStatus.WAITING_PAYMENT, u2);
    Order o3 = new Order(null, Instant.parse("2024-11-02T12:31:08Z"), OrderStatus.WAITING_PAYMENT, u1);

    userRepository.saveAll(Arrays.asList(u1,u2));
    orderRepository.saveAll(Arrays.asList(o1, o2, o3));
  }
}
