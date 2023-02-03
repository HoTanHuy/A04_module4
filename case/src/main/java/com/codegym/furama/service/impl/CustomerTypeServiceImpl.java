package com.codegym.furama.service.impl;


import com.codegym.furama.model.cutomer.CustomerType;
import com.codegym.furama.repository.ICustomerTypeRepository;
import com.codegym.furama.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {

    @Autowired
    ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAllCustomerType() {
        return customerTypeRepository.findAll();
    }
}
