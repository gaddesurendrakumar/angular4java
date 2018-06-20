package br.ngd.angular4java.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate date;
	
	private Boolean completed;

	public Task(){
	}
	
	public Task(Long id, String name, LocalDate date, Boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}
