package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.SellerDB;
import com.nctech.flipcart.dtos.SellerDTO;
import com.nctech.flipcart.repository.RepositorySellerI;

import java.util.List;

public class RepositorySellerImpl implements RepositorySellerI {

    @Override
    public void save(SellerDTO seller) {
        SellerDB.sellers.add(seller);
    }

    @Override
    public List<SellerDTO> get() {
        return SellerDB.sellers;
    }
}
