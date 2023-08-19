package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.HelpDTO;

import java.util.List;

public interface RepositoryHelpI {
    void save (HelpDTO help);
    List<HelpDTO> get();
}
