package com.example.servlet.listner;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author Maulik
 * 
 */
@WebListener
public class HttpSessionListenerDemo implements HttpSessionListener {

	private static int totalActiveSessions;

	public static int getTotalActiveSession() {
		return totalActiveSessions;
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		totalActiveSessions++;
		System.out
				.println(" == ------------------------  Session Created ------------------- == "
						+ totalActiveSessions);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		totalActiveSessions--;
		System.out
				.println(" == ------------------------  Session Destroyed ------------------- ==  "
						+ totalActiveSessions);
	}
}
