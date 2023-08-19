package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.CartDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryCartImpl;
import com.nctech.flipcart.sevices.CartService;

import java.util.List;

public class CartServiceImpl implements CartService {
    RepositoryCartImpl repositoryCart = new RepositoryCartImpl();
    @Override
    public void save(CartDTO cart) {
        repositoryCart.save(cart);
    }

    @Override
    public CartDTO findById(int id) {
        for (CartDTO cart: repositoryCart.get()) {
            if(cart.getId()== id){
                return cart;
            }
        }
        return null;
    }

    @Override
    public List<CartDTO> findAll() {
        return repositoryCart.get();
    }

    @Override
    public void update(CartDTO cart) {
         CartDTO cartDTO = findById(cart.getId());
         cartDTO.setProducts(cart.getProducts());
    }

    @Override
    public void delete(int id) {
     CartDTO cartDTO = findById(id);
     repositoryCart.get().remove(cartDTO);
    }
}
