package com.rkit.jpaproject.controllers;


import com.rkit.jpaproject.entities.Employee;
import com.rkit.jpaproject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){
        System.out.println("Came inside the Student Controller save method");
        return this.employeeService.save(employee);
    }

    @GetMapping
    public Set<Employee> fetchAll(){
        return this.employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") long employeeId){
        return this.employeeService.findById(employeeId);
    }
    @PutMapping("/{id}")
    public Employee updateEmployeeById(@PathVariable("id") long employeeId, @RequestBody Employee employee){
        return this.employeeService.update(employeeId,employee);
    }
    @GetMapping("/name/{name}")
    public List<Employee> fetchByName(@PathVariable("name") String name){
        return this.employeeService.findByName(name);
    }
}

