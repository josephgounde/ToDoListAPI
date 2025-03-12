package com.example.todoListAPI1;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Task API", version = "1.0", description = "Documentation Task API v1.0"))
public class TodoListApi1Application {

	public static void main(String[] args) {

		SpringApplication.run(TodoListApi1Application.class, args);
	}

}
