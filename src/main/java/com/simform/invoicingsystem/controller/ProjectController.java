package com.simform.invoicingsystem.controller;

import com.simform.invoicingsystem.dto.ProjectDetail;
import com.simform.invoicingsystem.dto.ProjectDetails;
import com.simform.invoicingsystem.service.ProjectService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @PutMapping(value = "/update/{projectName}")
    public ProjectDetail updateProject(HttpServletRequest request , @RequestBody ProjectDetail projectDetail , @PathVariable("projectName") String projectName){
        return projectService.updateProject(request , projectDetail , projectName);
    }
}
