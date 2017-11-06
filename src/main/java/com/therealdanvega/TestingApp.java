package com.therealdanvega;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.therealdanvega.service.TaskService;

@SpringBootApplication
public class TestingApp {

	@Autowired
	private TaskService taskService;
	
	public static void main(String[] args) {
		SpringApplication.run(TestingApp.class, args);
	}

//	@Bean
//	CommandLineRunner runner(TaskService taskService){
//		return args -> {
//			taskService.save( new Task(1L,"Create Spring Boot Application", LocalDate.now(), true) );
//			taskService.save( new Task(2L,"Create Spring Project Packages", LocalDate.now().plus(1,ChronoUnit.DAYS), false) );
//			taskService.save( new Task(3L,"Create the Task Domain Class", LocalDate.now().plus(3,ChronoUnit.DAYS), false) );
//			taskService.save( new Task(4L,"Create service and repository classes", LocalDate.now().plus(5,ChronoUnit.DAYS), false) );
//			taskService.save( new Task(5L,"Create the command line runner to load data", LocalDate.now().plus(8, ChronoUnit.DAYS), false) );
//			taskService.save( new Task(6L,"Create the required configuration properties", LocalDate.now().plus(10,ChronoUnit.DAYS), false) );
//			taskService.save( new Task(7L,"Run the Spring Boot Application", LocalDate.now().plus(12,ChronoUnit.DAYS), false) );
//			taskService.save( new Task(8L,"Check the H2 Console for the initial data", LocalDate.now().plus(13,ChronoUnit.DAYS), false) );
//		};
//	}

}
