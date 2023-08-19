package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.OfferDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryOfferImpl;
import com.nctech.flipcart.sevices.OfficeSevices;

import java.util.List;

public class OfficeSevicesImpl implements OfficeSevices {
    RepositoryOfferImpl repositoryOffer = new RepositoryOfferImpl();
    @Override
    public void save(OfferDTO office) {
        repositoryOffer.save(office);
    }

    @Override
    public OfferDTO findById(int id) {
        for (OfferDTO office : repositoryOffer.get()
             ) {
            if(office.getId()==id){
                return office;
            }
        }
        return null;
    }

    @Override
    public List<OfferDTO> findAll() {
        return repositoryOffer.get();
    }

    @Override
    public void update(OfferDTO office) {
        OfferDTO offerDTO = new OfferDTO();
        offerDTO.setOfferInPersontage(offerDTO.getOfferInPersontage());
    }

    @Override
    public void delete(int id) {
          OfferDTO offerDTO = findById(id);
          repositoryOffer.get().remove(offerDTO);
    }
}
