package br.ngd.angular4java.service;

import org.springframework.stereotype.Service;

import br.ngd.angular4java.domain.Task;
import br.ngd.angular4java.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

	private TaskRepository taskRepository;
	
	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}


	@Override
	public Iterable<Task> listAll() {
		return this.taskRepository.findAll();
	}


	@Override
	public Task save(Task task) {
		return this.taskRepository.save(task);
	}

}
