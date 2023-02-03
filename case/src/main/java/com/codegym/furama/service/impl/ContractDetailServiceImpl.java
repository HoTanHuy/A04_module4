package com.codegym.furama.service.impl;


import com.codegym.furama.model.contract.ContractDetail;
import com.codegym.furama.repository.IContractDetailRepository;
import com.codegym.furama.service.IContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements IContractDetailService {

    @Autowired
    IContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAllContractDetail() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void insert(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }
}
