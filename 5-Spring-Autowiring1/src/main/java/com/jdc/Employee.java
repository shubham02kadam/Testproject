package com.jdc;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired 
	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
