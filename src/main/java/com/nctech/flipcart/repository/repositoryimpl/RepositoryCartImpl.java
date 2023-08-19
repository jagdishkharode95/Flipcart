package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.CartDB;
import com.nctech.flipcart.dtos.CartDTO;
import com.nctech.flipcart.repository.RepositoryCartI;

import java.util.List;

public class RepositoryCartImpl implements RepositoryCartI {

    @Override
    public void save(CartDTO cart){
        CartDB.carts.add(cart);
    }

    @Override
    public List<CartDTO> get() {
        return CartDB.carts;
    }
}
