package com.example.springframework.di;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.Vehicle;

/**
 * @author Maulik
 * 
 */
public class RefBeanInjectionDemo {

	private static Logger logger = Logger.getLogger(RefBeanInjectionDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Vehicle vehicle = applicationContext.getBean("refBeanDemo",
				Vehicle.class);
		logger.info("Vehicle : " + vehicle);

		applicationContext.close();

	}

}
