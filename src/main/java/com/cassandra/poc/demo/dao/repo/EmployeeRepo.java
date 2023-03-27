package com.cassandra.poc.demo.dao.repo;

import com.cassandra.poc.demo.entity.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepo extends CassandraRepository<Employee, UUID> {
}
