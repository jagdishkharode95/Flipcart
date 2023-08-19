package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.WishlistDTO;

import java.util.List;

public interface WishlistServices {
    void save (WishlistDTO wishlistDTO);
    WishlistDTO findById(int id);
    List<WishlistDTO> findAll();
    void update (WishlistDTO wishlistDTO);
    void delete(int id);
}
