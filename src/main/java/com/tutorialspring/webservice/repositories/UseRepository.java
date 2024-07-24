package com.tutorialspring.webservice.repositories;

import com.tutorialspring.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository  extends JpaRepository<User, Long> {

}
