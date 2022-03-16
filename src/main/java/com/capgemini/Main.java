package com.capgemini;

import com.capgemini.entity.Employee;
import com.capgemini.entity.Office;
import com.capgemini.repository.EmployeeRepository;
import com.capgemini.repository.OfficeRepository;
import com.capgemini.service.EmployeeDTO;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.OfficeService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ConnectionManager manager = new MySQLConnectionManager();

        EmployeeRepository employeeRepository = new EmployeeRepository(manager);
        OfficeRepository officeRepository = new OfficeRepository(manager);

        EmployeeService employeeService = new EmployeeService(employeeRepository);
        OfficeService officeService = new OfficeService(officeRepository);


//        officeService.addOffice(new Office("8", "Bucharest", "09876", "12345",
//                "Romania", "68836", "EMEA"));
//        employeeService.addEmployee(new EmployeeDTO(2049, "Smith", "Jane",
//                "X7001", "jane@gmail.com", "8", 1002, "Job"));

//        officeService.addOffice(new Office("9", "Bucharest", "09876", "12345",
//                "Romania", "68836", "EMEA"));
//        employeeService.addEmployee(new EmployeeDTO(1002, "Smith", "Jane",
//                "X7001", "jane@gmail.com", "9", 1002, "Job"));


    }
}
