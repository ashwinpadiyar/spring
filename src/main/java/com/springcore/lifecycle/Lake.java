package com.springcore.lifecycle;

public class Lake {
	@Override
	public String toString() {
		return "Lake [depth=" + depth + "]";
	}

	public Lake() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double depth;

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		System.out.println("Setting property");
		this.depth = depth;
	}

	public void startMySpringInit() {
		System.out.println("Inside INIT");
	}

	public void endMySpringDestroy() {
		System.out.println("Inside destory");
	}
}
