package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    private ProjectRepository projectRepository;
    private EmployeeRepository employeeRepository;

    @Autowired
    public HomeController(ProjectRepository projectRepository, EmployeeRepository employeeRepository) {
        this.projectRepository = projectRepository;
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public String display(Model model){
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projectList",projects);

        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employeeList",employees);
        return "main/home.html";
    }

}
