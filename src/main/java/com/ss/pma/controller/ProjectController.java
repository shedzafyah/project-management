package com.ss.pma.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping("/new")
    public String displayProjectForm(){
        return "new-project.html";
    }

}
