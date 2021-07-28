package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.dto.*;
import com.ss.pma.repository.*;
import com.ss.pma.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/project")
public class ProjectController {

   private ProjectService projectService;
   private EmployeeService employeeService;

   @Autowired
   private EmployeeRepository employeeRepository;

   @Autowired
    public ProjectController(ProjectService projectService, EmployeeService employeeService) {
        this.projectService = projectService;
        this.employeeService = employeeService;
    }

    @RequestMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        List<Employee> employees = employeeService.listAllEmployees();
        model.addAttribute("allEmployees",employees);
        model.addAttribute("project",aProject);
        return "projects/new-project.html";
    }

    @PostMapping("/save")
    public String createProject(Project project,@RequestParam List<Long> employees, Model model){
        projectService.save(project);
        return "redirect:/project/new";
    }

    @GetMapping
    public String listAll(Model model){
        List<Project> projects = projectService.listAllProjects();
        model.addAttribute("project",projects);
        return "projects/list-projects.html";

    }

    @DeleteMapping("/")
    public String delete(@PathVariable("id") Long id,Model model){
        Optional<Project> project = projectService.findById(id);
        projectService.delete(project);
        return "";

    }





}
