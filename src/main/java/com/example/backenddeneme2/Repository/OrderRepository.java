package com.example.backenddeneme2.Repository;

import com.example.backenddeneme2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
