package com.springcore.contructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/contructorinjection/ciconfig.xml");
		Person p = (Person) context.getBean("person");
		Addition addition = (Addition) context.getBean("add");
		System.out.println(p.toString());
		addition.doSum();
	}

}
