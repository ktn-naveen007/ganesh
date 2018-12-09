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
@Table(name = "users")
public class Users {

	@Column(name = "userid")
	@Id
	private Integer uid;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

}
