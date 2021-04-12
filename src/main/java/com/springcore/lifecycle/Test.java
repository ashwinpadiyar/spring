package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/config.xml");
		Lake lake = (Lake) context.getBean("lake");
		System.out.println(lake);
		
		/* registering shutdownhook.
		 * In case the user needs to rename destroy method name, he can use
		 * "AbstactApplicationContext" and use the following method. This method
		 * searches for the destroy-method attribute in the config.xml file.
		 */
		context.registerShutdownHook();
	}
}
