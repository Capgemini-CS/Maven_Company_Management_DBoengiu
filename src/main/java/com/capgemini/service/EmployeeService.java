package com.capgemini.service;

import com.capgemini.entity.Employee;
import com.capgemini.map.EmployeeMapper;
import com.capgemini.repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
//    Repository employeeRepository = new EmployeeRepository();
    Repository<Employee> employeeRepository;

    public EmployeeService(Repository<Employee> employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {

        return employeeRepository.readAllValues().
                stream().
                map(EmployeeMapper::fromEmployee).
                collect(Collectors.toList());
    }

    public void addEmployee(EmployeeDTO employeeDTO) {
        Employee newEmployee = EmployeeMapper.fromDTO(employeeDTO);
        employeeRepository.add(newEmployee);
    }
}
