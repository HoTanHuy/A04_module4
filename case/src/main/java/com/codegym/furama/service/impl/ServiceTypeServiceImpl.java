package com.codegym.furama.service.impl;


import com.codegym.furama.model.facility.ServiceType;
import com.codegym.furama.repository.IServiceTypeRepository;
import com.codegym.furama.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {

    @Autowired
    IServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAllService() {
        return serviceTypeRepository.findAll();
    }
}
