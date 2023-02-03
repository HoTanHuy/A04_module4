package com.codegym.furama.service.impl;

import com.codegym.furama.model.facility.RentType;
import com.codegym.furama.repository.IRentTypeRepository;
import com.codegym.furama.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements IRentTypeService {

    @Autowired
    IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }
}
