package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.BillGenarateDB;
import com.nctech.flipcart.dtos.BillGenarateDTO;
import com.nctech.flipcart.repository.RepositoryBillGenerateI;

import java.util.List;

public class RepositoryBillGenerateImpl implements RepositoryBillGenerateI {

    @Override
    public void save(BillGenarateDTO billGenarate) {
        BillGenarateDB.billgenarats.add(billGenarate);
    }

    @Override
    public List<BillGenarateDTO> get() {
        return BillGenarateDB.billgenarats ;
    }
}
