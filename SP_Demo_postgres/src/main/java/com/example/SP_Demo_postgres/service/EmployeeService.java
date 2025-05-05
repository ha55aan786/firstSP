package com.example.SP_Demo_postgres.service;

import com.example.SP_Demo_postgres.dto.EmployeeDepartmentDTO;
import com.example.SP_Demo_postgres.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDepartmentDTO> getEmployeeDepartmentData() {
        return employeeRepository.getEmployeeDepartmentData();
    }
}
