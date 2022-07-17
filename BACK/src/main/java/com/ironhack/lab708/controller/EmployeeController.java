package com.ironhack.lab708.controller;

import com.ironhack.lab708.model.Employee;
import com.ironhack.lab708.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/all-employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @DeleteMapping("/delete-employee/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}
