package com.example.todoListAPI1.controller;

import com.example.todoListAPI1.model.Task;
import com.example.todoListAPI1.service.Taskservice;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // This annotation is a combination of @Controller and @ResponseBody. It tells Spring Boot that this class will handle HTTP requests and return JSON responses.
@RequestMapping("/tasks") // All endpoints in this class will start with the path /tasks.
@Tag(name = "Tasks", description = "Endpoints for managing tasks")
public class TaskController {

    @Autowired // an annotation to specify an injection of dependency
    private Taskservice taskService; // is injected in Taskcontroller

    @GetMapping //to specify that this method handles GET request on /tasks.
    @Operation(summary = "Get all tasks or filter by status") // to add a swagger description.
    public List<Task> getAllTasks(@RequestParam(required = false) String status) {
        if (status != null) {
            return taskService.getTasksByStatus(status);
        }
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}") //to specify that this method handles GET request on /tasks.
    @Operation(summary = "Get a task by ID") // to add a swagger description.
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping //to specify that this method handles POST request on /tasks.
    @Operation(summary = "Create a new task") // to add a swagger description.
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")// to specify that this method handles PUT request on /tasks/{id}.
    @Operation(summary = "Update an existing task") // to add a swagger description.
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return taskService.updateTask(id, taskDetails);
    }

    @DeleteMapping("/{id}") //to specify that this method handles DELETE request on /tasks/{id}.
    @Operation(summary = "Delete a task by ID") // to add a swagger description.
    public void deleteTask(@PathVariable Long id)// withdraws the Id of the task to delete from the url
    {
        taskService.deleteTask(id);
    }
}
