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
}
