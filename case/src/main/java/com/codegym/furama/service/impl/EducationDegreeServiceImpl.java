package com.codegym.furama.service.impl;


import com.codegym.furama.model.employee.EducationDegree;
import com.codegym.furama.repository.IEducationDegreeRepository;
import com.codegym.furama.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {

    @Autowired
    IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return educationDegreeRepository.findAll();
    }
}
