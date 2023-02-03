package com.codegym.furama.repository;


import com.codegym.furama.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from Employee where employee_name like ? and employee_email like ? and division_id like ?", nativeQuery = true)
    Page<Employee> searchEmployee(String name, String email, String divisionId, Pageable pageable);
}
