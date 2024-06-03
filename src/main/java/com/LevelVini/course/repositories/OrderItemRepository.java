package com.LevelVini.course.repositories;

import com.LevelVini.course.entities.OrderItem;
import com.LevelVini.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
