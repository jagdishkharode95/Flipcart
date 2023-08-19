package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.WishListDB;
import com.nctech.flipcart.dtos.WishlistDTO;
import com.nctech.flipcart.repository.RepositoryWishlistI;

import java.util.List;

public class RepositoryWishlistImpl implements RepositoryWishlistI {

    @Override
    public void save(WishlistDTO wishlist) {
        WishListDB.wishlists.add(wishlist);
    }

    @Override
    public List<WishlistDTO> get() {
        return WishListDB.wishlists;
    }
}
