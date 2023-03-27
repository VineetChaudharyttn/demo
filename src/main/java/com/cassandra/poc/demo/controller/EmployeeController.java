package com.cassandra.poc.demo.controller;

import com.cassandra.poc.demo.entity.Employee;
import com.cassandra.poc.demo.service.impl.EmployeeServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Api("Employee curd operation")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployeeList();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
}
