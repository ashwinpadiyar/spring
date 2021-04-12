package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Annotation based autowiring can be used with property, setter method and
 * constructor exclusively.
 *
 */
public class Emp {
	@Autowired
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	// @Autowired
	public void setAddress(Address address) {
		System.out.println("Inside setter method");
		this.address = address;
	}
}
