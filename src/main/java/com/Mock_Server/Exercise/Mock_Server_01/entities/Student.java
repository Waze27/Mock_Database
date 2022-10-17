package com.Mock_Server.Exercise.Mock_Server_01.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;
}
