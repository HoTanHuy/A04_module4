package com.codegym.furama.service;

import com.codegym.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAllEmployee(Pageable pageable);

    List<Employee> findAllList();

    void insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Integer id);

    Employee selectEmployee(Integer id);

    Page<Employee> searchEmployee(String nameSearch, String emailSearch, String divisionSearch, Pageable pageable);
}
