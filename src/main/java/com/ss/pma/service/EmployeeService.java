package com.ss.pma.service;

import com.ss.pma.domain.*;
import com.ss.pma.dto.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> listAllEmployees(){
        return employeeRepository.findAll();
    }

    public List<Project> getEmployeeProjects(){
        return employeeRepository.employeeProjects();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee findById(Long id){
        return employeeRepository.getById(id);
    }

    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
}
