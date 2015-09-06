package com.example.servlet.listner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class ServletRequestAttributeListenerDemo implements
		ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Add ------------------- == "
						+ srae.getName() + " = " + srae.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Remove ------------------- == "
						+ srae.getName() + " = " + srae.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out
				.println(" == ------------------------  Servlet Context Attribute : Replace ------------------- == "
						+ srae.getName() + " = " + srae.getValue());
	}

}
