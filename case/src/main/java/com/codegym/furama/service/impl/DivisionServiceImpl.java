package com.codegym.furama.service.impl;


import com.codegym.furama.model.employee.Division;
import com.codegym.furama.repository.IDivisionRepository;
import com.codegym.furama.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {

    @Autowired
    IDivisionRepository divisionRepository;

    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }
}
