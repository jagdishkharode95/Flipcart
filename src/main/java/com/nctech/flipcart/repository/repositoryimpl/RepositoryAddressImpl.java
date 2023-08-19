package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.AddressDB;
import com.nctech.flipcart.dtos.AddressDTO;
import com.nctech.flipcart.repository.RepositoryAddressI;


import java.util.List;

public class RepositoryAddressImpl implements RepositoryAddressI {

    @Override
    public void save(AddressDTO address) {
     AddressDB.addresses.add(address);
    }
    @Override
    public List<AddressDTO> get() {
        return AddressDB.addresses;
    }
}
