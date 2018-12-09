package com.jaiganesh.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {
	@Column(name = "id")
	@Id
	private Integer id;
	@Column(name = "name")
	private String studentName;
	@Column(name = "subject")
	private String studentSubject;

}
