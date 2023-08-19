package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.BillGenarateDTO;
import com.nctech.flipcart.repository.RepositoryBillGenerateI;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryBillGenerateImpl;
import com.nctech.flipcart.sevices.BillgenerateService;

import java.util.List;

public class BillgenerateServiceimpl implements BillgenerateService {
RepositoryBillGenerateImpl repositoryBillGenerate = new RepositoryBillGenerateImpl();
    @Override
    public void save(BillGenarateDTO billgenaration) {
        repositoryBillGenerate.save(billgenaration);
    }

    @Override
    public BillGenarateDTO findId(int id) {
        for (BillGenarateDTO billgnaration : repositoryBillGenerate.get()) {
                if (billgnaration.getId() == id){
                    return billgnaration;
                }
        }
        return null;
    }

    @Override
    public List<BillGenarateDTO> findall() {
        return repositoryBillGenerate.get();
    }

    @Override
    public void update(BillGenarateDTO billganerate) {
       BillGenarateDTO billGenarateDTO= new BillGenarateDTO();
       billganerate.setSrNo(billganerate.getSrNo());
       billganerate.setPrice(billganerate.getPrice());
       billganerate.setDiscont(billganerate.getDiscont());
       billganerate.setProductName(billganerate.getProductName());
       billganerate.setTotlePrice(billganerate.getTotlePrice());
       billganerate.setUserName(billganerate.getUserName());
    }

    @Override
    public void delete(int id) {
        BillGenarateDTO billGenarateDTO = findId(id);
        repositoryBillGenerate.get().remove(billGenarateDTO);


    }
}
