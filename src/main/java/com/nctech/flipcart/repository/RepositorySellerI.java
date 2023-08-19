package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.SellerDTO;

import java.util.List;

public interface RepositorySellerI {
    void save(SellerDTO seller);
    List<SellerDTO> get();
}
