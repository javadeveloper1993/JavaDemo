package com.example.servlet.listner;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletRequestListenerDemo implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out
				.println(" == ------------------------ Servlet  Request Initialized ------------------- == ");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out
				.println(" == ------------------------ Servlet  Request Destroyed ------------------- == ");
	}

}
