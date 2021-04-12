package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationComputer {
	private String ram;

	public String getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "AnnotationComputer [ram=" + ram + "]";
	}

	public AnnotationComputer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Method starting");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
}
