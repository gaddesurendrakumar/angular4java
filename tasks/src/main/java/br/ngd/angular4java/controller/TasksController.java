package br.ngd.angular4java.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ngd.angular4java.domain.Task;
import br.ngd.angular4java.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TasksController {

	@Qualifier("TaskServiceImpl")
	private TaskService taskService;

	public TasksController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}
	
	@GetMapping(value = {"", "/"})
	public Iterable<Task> listAll(){
		return taskService.listAll();
	}
	
	@PostMapping(value = {"", "/"})
	public Task save(@RequestBody Task task){
		return taskService.save(task);
	}

}
