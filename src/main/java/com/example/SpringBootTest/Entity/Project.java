package com.example.SpringBootTest.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "projectId")
    public Integer id;

    @Column(name = "project_Name")
    public String projectName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_developer_id")
    public List<Developer> listDeveloper = new ArrayList<>();

}
