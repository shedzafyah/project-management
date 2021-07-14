package com.ss.pma.controller;

import com.ss.pma.domain.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/project")
public class ProjectController {

    private ProjectRepository projectRepo;

    @Autowired
    public ProjectController(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }

    @RequestMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project",aProject);
        return "new-project.html";
    }

    @PostMapping("/save")
    public String createProject(Project project,Model model){
        //save to database
        projectRepo.save(project);
        return "redirect:/new";

    }



}
