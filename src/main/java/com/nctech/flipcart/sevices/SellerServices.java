package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.SellerDTO;

import java.util.List;

public interface SellerServices {
    void save (SellerDTO seller);
    SellerDTO findById (int id);
    List<SellerDTO> findAll();
    void update(SellerDTO sellerDTO);
    void delete(int id);
}
