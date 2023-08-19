package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.AddressDTO;

import java.util.List;

public interface AddressService {
    void save(AddressDTO address);
    AddressDTO findById(int id);
    List<AddressDTO> findAll();
    void update(AddressDTO address);
    void delete (int id);

}
