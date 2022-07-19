package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.ProjectDao;
import com.example.SpringBootTest.Entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectDao projectDao;

    public List<Project> getAllProject(){
        return projectDao.findAll();
    }

    public Project saveProject(Project project){
        return projectDao.save(project);
    }

    public Project getProjectById(Integer id){
        return projectDao.findById(id).get();
    }
}
