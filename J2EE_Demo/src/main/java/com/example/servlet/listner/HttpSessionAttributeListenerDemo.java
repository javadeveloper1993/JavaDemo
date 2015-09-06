package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionAttributeListenerDemo implements
		HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		String attributeName = event.getName();
		Object attributeValue = event.getValue();
		System.out
				.println(" == ------------------------ Http Session : Add ---------------  "
						+ attributeName + " : " + attributeValue);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String attributeName = event.getName();
		Object attributeValue = event.getValue();
		System.out
				.println(" == ------------------------ Http Session : Remove ---------------  "
						+ attributeName + " : " + attributeValue);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String attributeName = event.getName();
		Object attributeValue = event.getValue();
		System.out
				.println(" == ------------------------ Http Session : Replace ---------------  "
						+ attributeName + " : " + attributeValue);
	}
}