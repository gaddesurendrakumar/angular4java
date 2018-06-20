package br.ngd.angular4java;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.ngd.angular4java.domain.Task;
import br.ngd.angular4java.service.TaskService;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner (TaskService taskService){
		return args -> {
			taskService.save(new Task(1L, "create the project", LocalDate.now().plus(-2, ChronoUnit.DAYS), true));
			taskService.save(new Task(2L, "create main packages", LocalDate.now().plus(-1, ChronoUnit.DAYS), true));
			taskService.save(new Task(3L, "show task list", LocalDate.now(), true));
		};
	}
}
