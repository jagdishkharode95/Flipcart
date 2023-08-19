package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.HelpDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryHelpImpl;
import com.nctech.flipcart.sevices.HelpServices;

import java.util.List;

public class HelpServicesImpl implements HelpServices {
    RepositoryHelpImpl repositoryHelp= new RepositoryHelpImpl();
    @Override
    public void save(HelpDTO help) {
        repositoryHelp.save(help);
    }

    @Override
    public HelpDTO findById(int id) {
        for (HelpDTO help: repositoryHelp.get()
             ) {
            if(help.getId()==id){
                return help;
            }
        }
        return null;
    }

    @Override
    public List<HelpDTO> findAll() {
        return repositoryHelp.get();
    }

    @Override
    public void update(HelpDTO help) {
        HelpDTO helpDTO =new HelpDTO();
        helpDTO.setUserid(helpDTO.getId());
        helpDTO.setProblems(helpDTO.getProblems());
    }

    @Override
    public void delete(int id) {
        HelpDTO helpDTO = findById(id);
        repositoryHelp.get().remove(helpDTO);
    }
}