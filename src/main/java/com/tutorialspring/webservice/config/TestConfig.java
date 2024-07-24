package com.tutorialspring.webservice.config;

import com.tutorialspring.webservice.entities.User;
import com.tutorialspring.webservice.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
  @Autowired
  private UseRepository useRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(null, "Anderson", "anderson@mail.com", "1231232342", "dfasdfasdf");
    User u2 = new User(null, "Nosredna", "nosredna@mail.com", "423243234", "asdfasdfdfd");

    useRepository.saveAll(Arrays.asList(u1,u2));
  }
}
