package com.rkit.jpaproject.service;

import com.rkit.jpaproject.entities.Employee;
import com.rkit.jpaproject.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    public Employee save(Employee employee)
    {
        return this.employeeRepository.save(employee);
    }
    public Set<Employee> findAll(){
        return new HashSet<>(this.employeeRepository.findAll());
    }

//    public Set<Employee> findEmployeeByName(String name){
//        List<Employee> employees = this.employeeRepository.findByNameIgnoreCase(name);
//        return new HashSet<>(employees);
//    }
    public Employee findById(long employeeId){
        return this.employeeRepository
                .findById(employeeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee id"));
    }
    public Employee update(long employeeId, Employee employee) {

        Optional<Employee> optionalEmployee = this.employeeRepository.findById(employeeId);
        if (optionalEmployee.isPresent()) {
            Employee employeeFromDAO = optionalEmployee.get();
            employeeFromDAO.setName(employee.getName());
            employeeFromDAO.setEmailID(employee.getEmailID());
            return this.employeeRepository.save(employeeFromDAO);
        } else {
            throw new IllegalArgumentException("Employee with the id does not exists");
        }
    }

    public List<Employee> findByName(String name) {
        return this.employeeRepository.findByNameIgnoreCase(name);
    }



}


