package com.example.spring_boot_api.repository;

import com.example.spring_boot_api.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
