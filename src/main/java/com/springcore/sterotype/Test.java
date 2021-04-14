package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/steroconfig.xml");
		// In default case, any number of invocations will always return same
		// object(singleTon) behavior
		Student student1 = context.getBean("changedRefName", Student.class);
		System.out.println(student1);
		System.out.println(student1.getAddress());
		System.out.println(student1.getAddress().getClass().getName());
		System.out.println(student1.hashCode());

		Student student2 = context.getBean("changedRefName", Student.class);
		System.out.println(student2.hashCode());
		if (student1.hashCode() == student2.hashCode()) {
			System.out.println("[Student] As its single ton objects by default hash code's are same");
		}
		else {
			System.out.println(" Student objects are different, this must be of prototype scope");
		}

		// Configured bean scope for Teacher's object using XML
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		if (teacher1.hashCode() == teacher2.hashCode()) {
			System.out.println("[Teacher] As its single ton objects by default hash code's are same");
		} else {
			System.out.println(" Teacher objects are different, this must be of prototype scope");
		}
	}
}
