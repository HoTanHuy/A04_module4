package com.codegym.furama.service.impl;

import com.codegym.furama.model.employee.Position;
import com.codegym.furama.repository.IPositionRepository;
import com.codegym.furama.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {

    @Autowired
    IPositionRepository positionRepository;

    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }
}
