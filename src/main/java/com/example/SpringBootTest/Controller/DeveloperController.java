package com.example.SpringBootTest.Controller;

import com.example.SpringBootTest.Entity.Developer;
import com.example.SpringBootTest.Entity.Project;
import com.example.SpringBootTest.Service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {
    @Autowired
    private DeveloperService developerService;

    @GetMapping("/developers")
    public List<Developer> getAllDevelopers(){
        return developerService.getAllDevelopers();
    }

    @GetMapping("/developer/{id}")
    public Developer getDeveloper(@PathVariable Integer id){
        return developerService.getDeveloperbyId(id);
    }

    @PostMapping("/project/{projectId}/developer")
    public Project createDeveloper(@PathVariable Integer projectId, @RequestBody Developer developer){
        return developerService.saveDeveloper(projectId, developer);
    }
}
