package com.example.springframework.bean;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.Employee;

/**
 * @author Maulik
 * 
 */
public class StaticFactoryBeanDemo {

	private static Logger logger = Logger
			.getLogger(StaticFactoryBeanDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		Employee staticEmployee = (Employee) applicationContext
				.getBean("employeeStaticFactoryBeanDemo");
		logger.info(" ------> Static Factory Employee  Detail:: "
				+ staticEmployee);

		Employee employeeStaticFactoryInstanceObject = (Employee) applicationContext
				.getBean("employeeStaticFactoryInstanceBeanDemo");
		logger.info(" ------> Static Factory Instance Employee  Detail:: "
				+ employeeStaticFactoryInstanceObject);

		applicationContext.close();

	}

}
