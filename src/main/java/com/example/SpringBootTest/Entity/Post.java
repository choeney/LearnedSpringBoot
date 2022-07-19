package com.example.SpringBootTest.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer id;

    @Column(name = "post_title")
    private String title;

    @Column(name = "post_Ddescription")
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="fk_comment_id")
    private List<Comment> comments = new ArrayList<>();
}
