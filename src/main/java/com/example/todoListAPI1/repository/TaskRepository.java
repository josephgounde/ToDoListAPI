package com.example.todoListAPI1.repository;

import com.example.todoListAPI1.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Indique que cette interface est un repository Spring Data JPA.
public interface TaskRepository extends JpaRepository<Task, Long> //Fournit les méthodes CRUD de base pour l'entité Task.

{

    List<Task> findByStatus (String status); // permet de trouver les tâches par statut.

}
