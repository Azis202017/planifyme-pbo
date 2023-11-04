package com.planifyme.planifyme.repository;

import com.planifyme.planifyme.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Integer> {

}
