package br.ngd.angular4java.service;

import br.ngd.angular4java.domain.Task;

public interface TaskService {

	public Iterable<Task> listAll();
	
	public Task save(Task task);
	
}
