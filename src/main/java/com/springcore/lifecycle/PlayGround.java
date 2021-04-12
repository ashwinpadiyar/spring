package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PlayGround implements InitializingBean, DisposableBean {
	private double dimension;

	public PlayGround() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	@Override
	public String toString() {
		return "PlayGround [dimension=" + dimension + "]";
	}

	// This method acts as destory() method through interface DisposableBean
	public void destroy() throws Exception {
		System.out.println("Lets end the game");
	}

	// This method acts a INIT() method through Interface InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("Lets begin the game");
	}
}
