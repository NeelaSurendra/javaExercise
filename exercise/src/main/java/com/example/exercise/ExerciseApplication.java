package com.example.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import com.example.exercise.service.listService;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);
	}

	// we are using ApplicationRunner to run code after the application context is loaded
	@Bean
	public ApplicationRunner runner(listService service) {
		return args -> service.displayList();
	}

}
