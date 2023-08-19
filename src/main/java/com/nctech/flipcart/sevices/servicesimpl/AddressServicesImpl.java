package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.database.AddressDB;
import com.nctech.flipcart.dtos.AddressDTO;
import com.nctech.flipcart.repository.RepositoryAddressI;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryAddressImpl;
import com.nctech.flipcart.sevices.AddressService;

import java.util.List;

public class AddressServicesImpl implements AddressService {
    RepositoryAddressImpl repositoryAddress = new RepositoryAddressImpl();

    @Override
    public void save(AddressDTO address) {
        repositoryAddress.save(address);
    }

    @Override
    public AddressDTO findById(int id) {

        for (AddressDTO addressDTO : repositoryAddress.get()) {
            if (addressDTO.getId() == id) {
                return addressDTO;
            }
        }

        return null;
    }

    @Override
    public List<AddressDTO> findAll() {
        return repositoryAddress.get();
    }

    @Override
    public void update(AddressDTO address) {
        AddressDTO addressDTO = findById(address.getId());
        addressDTO.setAddress(address.getAddress());
        addressDTO.setPincode(address.getPincode());
        addressDTO.setState(address.getState());
    }

    @Override
    public void delete(int id) {
        AddressDTO addressDTO = findById(id);
        repositoryAddress.get().remove(addressDTO);
    }
}