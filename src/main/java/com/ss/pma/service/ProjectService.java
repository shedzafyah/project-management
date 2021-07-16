package com.ss.pma.service;

import com.ss.pma.domain.*;
import com.ss.pma.dto.*;
import com.ss.pma.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class ProjectService {

    private ProjectRepository projectRepo;

    @Autowired
    public ProjectService(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }

    public List<Project> listAllProjects(){
        return projectRepo.findAll();
    }

    public void save(Project project){
        projectRepo.save(project);
    }

    public Optional<Project> findById(Long id){
        return projectRepo.findById(id);
    }

    public void delete(Optional<Project> project){
        delete(project);
    }

    private ProjectDTO convertToProjectDTO(Project project){
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setName(project.getName());
        projectDTO.setStage(project.getStage());
        return projectDTO;
    }
}
