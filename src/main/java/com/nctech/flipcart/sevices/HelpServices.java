package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.HelpDTO;

import java.util.List;

public interface HelpServices {
    void save (HelpDTO help);
    HelpDTO findById(int id);
    List<HelpDTO> findAll();
    void update(HelpDTO help);
    void delete(int id);
}
