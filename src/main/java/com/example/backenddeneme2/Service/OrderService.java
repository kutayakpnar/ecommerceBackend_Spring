package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.entity.Order;

import java.util.List;

public interface OrderService {

    public Order saveOrder(Order order);

    public Order getOrderById(Integer id);

    public List<Order> getAllOrders();


}
