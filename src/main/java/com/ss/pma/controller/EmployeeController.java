package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/new")
    public  String displayEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new-employee.html";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model){
       employeeRepo.save(employee);
       return "redirect:/new";
    }

}
