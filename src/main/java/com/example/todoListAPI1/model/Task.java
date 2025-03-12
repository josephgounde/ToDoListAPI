package com.example.todoListAPI1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity // Indique que cette classe est une entité JPA.
//@Data  Annotation Lombok pour générer les getters, setters, equals(), hashCode() et toString().

public class Task {

    @Id // to specify that Id is the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// to generate all the values of the primary key
    private Long id;
    private String title;
    private String description;
    private String status; // à faire, en cours, terminé


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
