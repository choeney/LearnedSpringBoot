package com.example.SpringBootTest;

import com.example.SpringBootTest.Controller.UserController;
import com.example.SpringBootTest.Entity.*;
import com.example.SpringBootTest.Service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication implements CommandLineRunner {


	@Autowired
	private PostService postService;
	@Autowired
	private CommentService commandService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private UserTableService userTableService;


	private  static final Logger logger = LoggerFactory.getLogger(SpringBootTestApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Post post = new Post();
//		post.setDescription("This post is regarding spring boot");
//		post.setTitle("Spring Boot Tutorial");
//
//		Comment comment = new Comment();
//		comment.setText("Just testing");
//		comment.setPost(post);
//
//		Comment comment2 = new Comment();
//		comment2.setText("Just Testing ");
//		comment2.setPost(post);

//		postService.savePost(post);
		//commandService.saveComment(comment);
//		commandService.saveComment(comment2);

//		Project project = new Project();
//		project.setProjectName("Student Management");
//
//		Developer developer1 = new Developer();
//		developer1.setName("Tenzin Choeney");
//		developer1.setExperience(5);
//		developer1.setDateStarted("5/12/21");
//
//		Developer developer2 = new Developer();
//		developer2.setName("Tenzin Wangchok");
//		developer2.setExperience(1);
//		developer2.setDateStarted("5/12/21");
//
//		projectService.saveProject(project);
//		developerService.saveDeveloper(1, developer1);

//		UserProfile userProfile1 = UserProfile.builder().Country("USA").dateBirth("20-04-1996").phoneNumber("98343483").gender(Gender.MALE).build();
//		Users user1 = Users.builder().firstName("THird").lastName("Lsst").email("third@gmail.com").userProfile(userProfile1).build();
//
//		userProfile1.setUsers(user1);
//
//		userTableService.saveUsers(user1);

	}
}
