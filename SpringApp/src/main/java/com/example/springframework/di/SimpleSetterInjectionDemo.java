package com.example.springframework.di;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.User;

/**
 * @author Maulik
 * 
 */
public class SimpleSetterInjectionDemo {

	private static Logger logger = Logger
			.getLogger(SimpleSetterInjectionDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		User userSetterInjection = applicationContext.getBean(
				"userSimpleSetterInjection", User.class);
		logger.info("User Setter Injection : " + userSetterInjection);

		applicationContext.close();

	}

}
