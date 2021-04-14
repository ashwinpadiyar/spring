package com.springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The reference name is usually the same as the class name in the camel case,
 * if the user wishes to change it we can pass an argument as shown below inside
 * the annotation component.
 */
@Component("changedRefName")
public class Student {
	@Value("Ashwin Padiyar")
	private String studentName;
	@Value("Bengaluru")
	private String city;

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
