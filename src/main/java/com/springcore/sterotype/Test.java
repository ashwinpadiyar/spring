package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/sterotype/steroconfig.xml");
		Student person1 = context.getBean("student", Student.class);
		System.out.println(person1);
	}
}
