package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.CartDTO;

import java.util.List;

public interface RepositoryCartI {
    void save (CartDTO cart);

    List<CartDTO> get();
}
