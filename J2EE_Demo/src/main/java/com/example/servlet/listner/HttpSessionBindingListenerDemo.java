package com.example.servlet.listner;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionBindingListenerDemo implements
		HttpSessionBindingListener {

	ServletContext context;

	public HttpSessionBindingListenerDemo() {
	}

	public HttpSessionBindingListenerDemo(ServletContext context) {
		this.context = context;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println("[" + new Date() + "] BOUND as " + event.getName()
				+ " to " + event.getSession().getId());
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println("[" + new Date() + "] UNBOUND as " + event.getName()
				+ " from " + event.getSession().getId());
	}

}
