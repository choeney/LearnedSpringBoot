package com.example.SpringBootTest.Service;

import com.example.SpringBootTest.Dao.DeveloperDao;
import com.example.SpringBootTest.Dao.ProjectDao;
import com.example.SpringBootTest.Entity.Developer;
import com.example.SpringBootTest.Entity.Project;
import com.example.SpringBootTest.Exceptions.InvalidUsernameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    private DeveloperDao developerDao;

    @Autowired
    private ProjectDao projectDao;

    public List<Developer> getAllDevelopers(){
        return developerDao.findAll();
    }

    public ResponseEntity<Object> addDeveloper(Developer developer){
        if(developer.getName() == ""){
            throw new InvalidUsernameException("Empty Developer Name");
        }
        developerDao.save(developer);
        return new ResponseEntity<Object>(developer, HttpStatus.CREATED);
    }

    public Developer getDeveloperbyId(Integer id){
        return developerDao.findById(id).get();
    }

    public Project saveDeveloper(Integer projectId, Developer developer){
        developerDao.save(developer);
        Project developerToProject = projectDao.findById(projectId).get();
        developerToProject.getListDeveloper().add(developer);
        System.out.println(developerToProject.getListDeveloper());

        return projectDao.save(developerToProject);
    }
}
