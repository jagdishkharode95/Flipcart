package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.AddressDTO;

import java.util.List;

public interface RepositoryAddressI {
public void save(AddressDTO address);

public  List<AddressDTO> get();
}
