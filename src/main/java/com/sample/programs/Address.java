package com.sample.programs;

public class Address {
	
	String street;
	int pinCode;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", pinCode=" + pinCode + "]";
	}
	public Address(String street, int pinCode) {
		super();
		this.street = street;
		this.pinCode = pinCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	

}
