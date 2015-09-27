package com.example.springframework.di;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.User;

/**
 * @author Maulik
 * 
 */
public class SimpleConstructorInjectionDemo {

	private static Logger logger = Logger
			.getLogger(SimpleConstructorInjectionDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		User user = applicationContext.getBean("userEmptyConstructor",
				User.class);
		logger.info("User : " + user);

		User userOneArgConstructor = applicationContext.getBean(
				"userOneArgConstructor", User.class);
		logger.info("User One Arg Constructor : " + userOneArgConstructor);

		User userTwoConstructor = applicationContext.getBean(
				"userTwoConstructor", User.class);
		logger.info("User Two Arg  Constructor : " + userTwoConstructor);

		applicationContext.close();

	}

}
