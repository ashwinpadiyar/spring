package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * The reference name is usually the same as the class name in the camel case,
 * if the user wishes to change it we can pass an argument as shown below inside
 * the annotation component.
 */
@Component("changedRefName")
// adding this scope will make the Test class return two different hashcodes for Student object .
@Scope("prototype")
public class Student {
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Value("Ashwin Padiyar")
	private String studentName;
	@Value("Bengaluru")
	private String city;
	
	@Value("#{temp}")
	private List<String> address;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
