package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.repository.*;
import com.ss.pma.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/new")
    public  String displayEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employees/new-employee.html";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model){
        employeeService.save(employee);
        return "redirect:/employee/new";
    }

    @GetMapping
    public String listAllEmployee(Employee employee, Model model){
        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("employee",employees);
        return "employees/list-employees.html";
    }

    @GetMapping("/delete/{id}")
   public String delete(@PathVariable Long id){
       employeeService.delete(id);
       return "redirect:/employee";
   }

   @PostMapping("/update")
   public String displayEmployeeUpdateForm(@RequestParam("id") Long theId, Model model) {

       Employee employees = employeeService.findById(theId);

       model.addAttribute("employee", employees);

       return "employees/new-employee";
   }

}
