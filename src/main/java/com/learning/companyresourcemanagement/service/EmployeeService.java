package com.learning.companyresourcemanagement.service;

import com.learning.companyresourcemanagement.entity.Employee;

import java.util.List;

public interface EmployeeService{
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long employeeId);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long employeeId);
}
