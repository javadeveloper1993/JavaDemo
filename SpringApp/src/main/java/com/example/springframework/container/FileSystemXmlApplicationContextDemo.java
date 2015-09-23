package com.example.springframework.container;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.example.springframework.model.Employee;

/**
 * @author Maulik
 * 
 */
public class FileSystemXmlApplicationContextDemo {

	private static Logger logger = Logger
			.getLogger(FileSystemXmlApplicationContextDemo.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"src/main/java/com/example/springframework/container/applicationContextForFileSystemXml.xml");

		Employee employee = (Employee) applicationContext
				.getBean("applicationContext_employeeWithName");
		logger.info(" ------> Employee :: " + employee);

		String[] aliases = applicationContext
				.getAliases("applicationContext_employeeWithName");
		logger.info(" ------- Employee With Aliases ----------- ");
		for (String name : aliases) {
			logger.info(" ------> Employee Comes From Aliases " + name + " :: "
					+ applicationContext.getBean(name));
		}

	}
}
