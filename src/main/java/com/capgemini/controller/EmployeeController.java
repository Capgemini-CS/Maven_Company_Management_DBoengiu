package com.capgemini.controller;

import com.capgemini.ConnectionManager;
import com.capgemini.MySQLConnectionManager;
import com.capgemini.entity.Employee;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.Repository;
import com.capgemini.service.EmployeeDTO;
import com.capgemini.service.EmployeeService;

public class EmployeeController {
    public static void main(String[] args) {
        ConnectionManager manager  = new MySQLConnectionManager();

        Repository<Employee> repository = new EmployeeRepository(manager);

        EmployeeDTO employeeDTO = new EmployeeDTO(2048, "Montreal", "Jane",
                "X7000", "jane@gmail.com", "2", 1002, "Job");

        EmployeeService employeeService = new EmployeeService(repository);


        System.out.println(employeeService.getAllEmployees().size());

        employeeService.addEmployee(employeeDTO);
    }
}
