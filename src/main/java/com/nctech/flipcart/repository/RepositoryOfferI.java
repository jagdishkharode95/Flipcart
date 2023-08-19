package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.OfferDTO;

import java.util.List;

public interface RepositoryOfferI {
    void save (OfferDTO offer);
    List<OfferDTO> get();
}
