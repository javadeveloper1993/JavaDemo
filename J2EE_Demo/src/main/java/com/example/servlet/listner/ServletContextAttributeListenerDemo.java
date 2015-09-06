package com.example.servlet.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletContextAttributeListenerDemo implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Add ------------------- == "
						+ event.getName() + " = " + event.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Remove ------------------- == "
						+ event.getName() + " = " + event.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Replace ------------------- == "
						+ event.getName() + " = " + event.getValue());
	}

}
