package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.OfferDB;
import com.nctech.flipcart.dtos.OfferDTO;
import com.nctech.flipcart.repository.RepositoryOfferI;

import java.util.List;

public class RepositoryOfferImpl implements RepositoryOfferI {

    @Override
    public void save(OfferDTO offer) {
        OfferDB.offers.add(offer);
    }

    @Override
    public List<OfferDTO> get() {
        return OfferDB.offers;
    }
}
