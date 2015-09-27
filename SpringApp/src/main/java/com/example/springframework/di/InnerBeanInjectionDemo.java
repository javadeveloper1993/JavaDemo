package com.example.springframework.di;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.Vehicle;

/**
 * @author Maulik
 * 
 */
public class InnerBeanInjectionDemo {

	private static Logger logger = Logger.getLogger(InnerBeanInjectionDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Vehicle vehicle = applicationContext.getBean("innerBeanDemo",
				Vehicle.class);
		logger.info("Inner Bean Demo Vehicle : " + vehicle);

		applicationContext.close();

	}

}
