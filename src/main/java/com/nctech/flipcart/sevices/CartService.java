package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.CartDTO;

import java.util.List;

public interface CartService {
    void save(CartDTO cart);
    CartDTO findById(int id);
    List<CartDTO> findAll();
    void update(CartDTO cart);
    void delete (int id);
}
