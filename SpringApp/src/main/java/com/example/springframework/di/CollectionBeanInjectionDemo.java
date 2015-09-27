package com.example.springframework.di;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springframework.model.CollectionBean;

/**
 * @author Maulik
 * 
 */
public class CollectionBeanInjectionDemo {

	private static Logger logger = Logger
			.getLogger(CollectionBeanInjectionDemo.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CollectionBean collectionBean = applicationContext.getBean(
				"collectionBeanDemo", CollectionBean.class);
		logger.info("Collection Bean Demo : " + collectionBean);

		applicationContext.close();

	}

}
