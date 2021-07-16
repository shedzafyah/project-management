package com.ss.pma.domain;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,length = 25)
    private String firstname;

    @Column(unique = true,length = 30)
    private String lastname;

    @Column(nullable = false,unique = true,length = 40)
    private String email;

    @ManyToOne(cascade ={CascadeType.DETACH ,CascadeType.PERSIST,CascadeType.REFRESH} ,
    fetch = FetchType.LAZY
    )
    @JoinColumn(name = "project_id")
    private Project project;

    public Employee() {

    }

    public Employee(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
