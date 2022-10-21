package kz.narxoz.springbootapp.services;

import kz.narxoz.springbootapp.models.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
}
