package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id);
    public void deleteById(Long id);
    public Employee updateEmployeeById(Long id,Employee employee);
}
