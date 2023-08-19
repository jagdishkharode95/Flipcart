package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.WishlistDTO;

import java.util.List;

public interface RepositoryWishlistI {
    void save(WishlistDTO wishlist);
    List<WishlistDTO> get();
}
