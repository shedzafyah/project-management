package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/home")
public class HomeController {

   private EmployeeService employeeService;
   private ProjectService projectService;

   @Value("${version}")
   private String ver;

   @Autowired
    public HomeController(EmployeeService employeeService, ProjectService projectService) {
        this.employeeService = employeeService;
        this.projectService = projectService;
    }

    @GetMapping
    public String display(Model model){
        List<Project> projects = projectService.listAllProjects();
        model.addAttribute("projectList",projects);

        model.addAttribute("versionNumber",ver);

        /*
        List<EmployeeProject> employeesProjectCount = employeeService.getEmployeeProjects();
        model.addAttribute("employeeProjectListCount",employeesProjectCount);
         */

        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("employeeList",employees);

        return "main/home.html";


    }

}
