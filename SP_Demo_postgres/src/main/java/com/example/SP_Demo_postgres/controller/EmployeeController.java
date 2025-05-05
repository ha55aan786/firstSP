package com.example.SP_Demo_postgres.controller;

import com.example.SP_Demo_postgres.dto.EmployeeDepartmentDTO;
import com.example.SP_Demo_postgres.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/department-data")
    public List<EmployeeDepartmentDTO> getEmployeeDepartmentData() {
        return employeeService.getEmployeeDepartmentData();
    }
}

