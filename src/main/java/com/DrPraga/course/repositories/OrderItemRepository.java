package com.DrPraga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DrPraga.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
