package com.DrPraga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DrPraga.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
