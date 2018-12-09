package com.sample.programs;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	int eid;
	Address address;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
@Autowired
	public Employee(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", address=" + address + "]";
	}

}
