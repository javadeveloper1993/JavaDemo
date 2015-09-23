package com.example.springframework.container;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.springframework.model.Employee;

/**
 * @author Maulik
 * 
 */
public class BeanFactoryDemo {

	private static Logger logger = Logger.getLogger(BeanFactoryDemo.class);

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		logger.info(beanFactory);

		Employee employee = (Employee) beanFactory
				.getBean("beanFactory_employee");
		logger.info(" ------> Employee :: " + employee);

		String[] aliases = beanFactory.getAliases("beanFactory_employee");
		logger.info(" ------- Employee With Aliases ----------- ");
		for (String name : aliases) {
			logger.info(" ------> Employee Comes From Aliases " + name + " :: "
					+ beanFactory.getBean(name));
		}

		Employee employeeWithName = (Employee) beanFactory
				.getBean("beanFactory_employeeWithName");
		logger.info(" ------> Employee With Name :: " + employeeWithName);

		String[] aliasesWithName = beanFactory
				.getAliases("beanFactory_employeeWithName");
		logger.info(" ------- Employee With Name Aliases ----------- ");
		for (String name : aliasesWithName) {
			logger.info(" ------> Employee With Name Comes From Aliases "
					+ name + " :: " + beanFactory.getBean(name));
		}

		logger.info("beanFactory_employee >> isSingleton :: "
				+ beanFactory.isSingleton("beanFactory_employee"));
		logger.info("beanFactory_employeeWithName >> isPrototype :: "
				+ beanFactory.isPrototype("beanFactory_employeeWithName"));

		logger.info("beanFactory_employeeWithName >> containsBean :: "
				+ beanFactory.containsBean("beanFactory_employeeWithName"));

		logger.info("beanFactory.getType :: "
				+ beanFactory.getType("beanFactory_employeeWithName"));

	}

}
