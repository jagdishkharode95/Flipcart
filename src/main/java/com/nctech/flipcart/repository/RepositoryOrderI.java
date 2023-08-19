package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.OrderDTO;

import java.util.List;

public interface RepositoryOrderI {
    void save(OrderDTO order);
    List<OrderDTO> get();
}
