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
@Table(name="employee")
public class Employee {

@Column(name = "emp_ID")
@Id
private Integer eid;

@Column(name="emp_Name")
private String ename;

@Column(name="emp_Role")
private String erole;


}
