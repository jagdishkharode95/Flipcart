package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.WishlistDTO;
import com.nctech.flipcart.repository.RepositoryWishlistI;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryWishlistImpl;
import com.nctech.flipcart.sevices.WishlistServices;

import java.util.List;

public class WishlistServicesImpl implements WishlistServices {
    RepositoryWishlistImpl repositoryWishlist=new RepositoryWishlistImpl();
    @Override
    public void save(WishlistDTO wishlistDTO) {
        repositoryWishlist.save(wishlistDTO);
    }

    @Override
    public WishlistDTO findById(int id) {
        for (WishlistDTO wishlist:repositoryWishlist.get()
             ) {
            if(wishlist.getId()==id){
                return wishlist;
            }
        }
        return null;
    }

    @Override
    public List<WishlistDTO> findAll() {
        return repositoryWishlist.get();
    }

    @Override
    public void update(WishlistDTO wishlistDTO) {
     WishlistDTO wishlistDTO1=new WishlistDTO();
     wishlistDTO1.setProduct(wishlistDTO1.getProduct());
    }

    @Override
    public void delete(int id) {
      WishlistDTO wishlistDTO = findById(id);
      repositoryWishlist.get().remove(wishlistDTO);
    }
}
