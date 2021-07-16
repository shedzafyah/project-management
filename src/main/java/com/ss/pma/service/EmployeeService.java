package com.ss.pma.service;

import com.ss.pma.domain.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> listAll(){
        return employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee findById(Long id){
        return employeeRepository.getById(id);
    }


    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }
}
