package com.example.servlet.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletContextListenerDemo implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out
				.println(" == ------------------------  contextInitialized ------------------- == "
						+ sce.getServletContext().getContextPath());
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out
				.println(" == ------------------------  contextDestroyed ------------------- == "
						+ sce.getServletContext().getContextPath());
	}

}
