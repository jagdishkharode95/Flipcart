package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.HelpDTO;
import com.nctech.flipcart.dtos.OfferDTO;

import java.util.List;

public interface OfficeSevices {
    void save (OfferDTO office);
    OfferDTO findById(int id);
    List<OfferDTO> findAll();
    void update(OfferDTO office);
    void delete(int id);
}
