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
@Table(name = "heros")
public class Hero {

	@Column(name = "id")
	@Id
	private Integer eid;

	@Column(name = "name")
	private String ename;

	

}