package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Entity.Project;
import com.example.SpringBootTest.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }

    @GetMapping("/project/{id}")
    public Project getProjectById(@PathVariable Integer id){
        return projectService.getProjectById(id);
    }

    @PostMapping("/")
    public Project createproject(@RequestBody Project project){
        return projectService.saveProject(project);

    }
}
