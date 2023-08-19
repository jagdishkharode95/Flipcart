package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.HelpDB;
import com.nctech.flipcart.dtos.HelpDTO;
import com.nctech.flipcart.repository.RepositoryHelpI;

import java.util.List;

public class RepositoryHelpImpl implements RepositoryHelpI {

    @Override
    public void save(HelpDTO help) {
        HelpDB.helps.add(help);
    }

    @Override
    public List<HelpDTO> get() {
        return HelpDB.helps;
    }
}
