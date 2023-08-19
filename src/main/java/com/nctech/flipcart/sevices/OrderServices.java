package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.OrderDTO;

import java.util.List;

public interface OrderServices {
    void save (OrderDTO order);
    OrderDTO findById(int id);
    List<OrderDTO> findAll();
    void update(OrderDTO order);
    void delete(int id);
}
