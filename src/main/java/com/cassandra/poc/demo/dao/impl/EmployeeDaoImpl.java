package com.cassandra.poc.demo.dao.impl;

import com.cassandra.poc.demo.dao.repo.EmployeeRepo;
import com.cassandra.poc.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmplyees() {
        return employeeRepo.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}