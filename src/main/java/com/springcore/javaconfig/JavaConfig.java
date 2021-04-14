package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	/**
	 * Instead of configuring bean with XML tag <bean> or annotation @Component we
	 * will try a new approach that is @Bean
	 * 
	 * @return
	 */
	@Bean
	public Book getBook() {
		Book book = new Book();
		return book;
	}

	/**
	 * This is similar to @Component("Student"), in the below @Bean annotation
	 * during runtime it will try to configure the array of reference variables
	 * mentioned in name attribute
	 * 
	 * @return
	 */
	@Bean(name = { "student", "test", "obj" })
	public Student getStudent() {
		Student student = new Student(getBook());
		return student;
	}
}
