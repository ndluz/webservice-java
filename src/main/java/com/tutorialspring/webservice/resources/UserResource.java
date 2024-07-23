package com.tutorialspring.webservice.resources;

import com.tutorialspring.webservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  @GetMapping
  public ResponseEntity<User> findAll()   {
    User user = new User(1L, "Anderson", "anderson@mail.com", "1231232312","password");
    return ResponseEntity.ok().body(user);
  }
}
