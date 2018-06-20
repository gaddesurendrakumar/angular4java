package br.ngd.angular4java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ngd.angular4java.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
