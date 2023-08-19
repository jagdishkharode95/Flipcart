package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.SellerDTO;
import com.nctech.flipcart.repository.RepositorySellerI;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryReview_RatingImpl;
import com.nctech.flipcart.repository.repositoryimpl.RepositorySellerImpl;
import com.nctech.flipcart.sevices.SellerServices;

import java.util.List;

public class SellerServicesImpl implements SellerServices {
    RepositorySellerImpl repositorySeller = new RepositorySellerImpl();
    @Override
    public void save(SellerDTO seller) {
        repositorySeller.save(seller);
    }

    @Override
    public SellerDTO findById(int id) {
        for (SellerDTO seller: repositorySeller.get()
             ) {
            if(seller.getId()==id){
                return seller;
            }
        }
        return null;
    }

    @Override
    public List<SellerDTO> findAll() {
        return repositorySeller.get();
    }

    @Override
    public void update(SellerDTO sellerDTO) {
        SellerDTO seller= new SellerDTO();
        seller.setAddress(seller.getAddress());
        seller.setName(seller.getName());
        seller.setMobileNumber(seller.getMobileNumber());
    }

    @Override
    public void delete(int id) {
        SellerDTO sellerDTO = findById(id);
        repositorySeller.get().remove(sellerDTO);
    }
}
