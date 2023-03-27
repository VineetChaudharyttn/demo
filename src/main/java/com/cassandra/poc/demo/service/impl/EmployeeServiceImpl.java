package com.cassandra.poc.demo.service.impl;

import com.cassandra.poc.demo.dao.EmployeeDao;
import com.cassandra.poc.demo.dao.impl.EmployeeDaoImpl;
import com.cassandra.poc.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;


    public List<Employee> getEmployeeList() {
        return employeeDao.getAllEmplyees();
    }

    public Employee createEmployee(Employee employee) {
        return employeeDao.createEmployee(employee);
    }
}
