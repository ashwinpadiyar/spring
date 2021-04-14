package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Book getBook() {
		Book book = new Book();
		return book;
	}

	@Bean
	/**
	 * Instead of configuring bean with XML tag <bean> or annotation @Component we
	 * will try a new approach that is @Bean
	 * 
	 * @return
	 */
	public Student getStudent() {
		Student student = new Student(getBook());
		return student;
	}
}
