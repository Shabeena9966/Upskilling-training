package com.cg.staffpoc.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "join_date")
    private LocalDate joinDate;

    private double salary;

    @OneToMany(mappedBy = "staff",cascade = CascadeType.ALL)
    private List<Project> projects;

    public Staff() {
    }

    public Staff(Long id, String name, LocalDate joinDate, double salary, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.joinDate = joinDate;
        this.salary = salary;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
