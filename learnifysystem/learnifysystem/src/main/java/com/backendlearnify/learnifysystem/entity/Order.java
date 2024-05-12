package com.backendlearnify.learnifysystem.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;
    private Date date;
    private String price;
    private String status;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
