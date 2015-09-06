package com.example.servlet.utils;

import java.util.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Maulik
 * 
 */
public class HttpSessionInfo {
	/**
	 * @param httpSession
	 * @return
	 */
	public static String displayInfoAboutHttpSession(HttpSession httpSession) {
		String servletContextInfo = "";
		if (httpSession != null) {
			servletContextInfo += "<div><b> 1. Session Id : </b>" + httpSession.getId();
			servletContextInfo += "<div><b> 2. Creation Time : </b>"
					+ new Date(httpSession.getCreationTime());
			servletContextInfo += "<div><b> 3. Last Accessed Time : </b>"
					+ new Date(httpSession.getLastAccessedTime());
			servletContextInfo += "<div><b> 4. Max Inactive Interval : </b>"
					+ httpSession.getMaxInactiveInterval() + " Second";

			// int maxInactiveInterval = httpSession.getMaxInactiveInterval();
			//
			// Calendar finalSessionExpiryTime = Calendar.getInstance();
			// int hour = finalSessionExpiryTime.get(Calendar.HOUR_OF_DAY);
			// int Minute = finalSessionExpiryTime.get(Calendar.MINUTE);
			// int Second = finalSessionExpiryTime.get(Calendar.SECOND);
			//
			// if (maxInactiveInterval >= 3600) {
			// finalSessionExpiryTime.set(Calendar.HOUR, hour + 1);
			// } else {
			// finalSessionExpiryTime.set(Calendar.SECOND, Second
			// + maxInactiveInterval);
			// }
			//
			Date expiry = new Date(httpSession.getLastAccessedTime()
					+ httpSession.getMaxInactiveInterval() * 1000);

			servletContextInfo += "<div><b> 5. Session Expire Time : </b>"
					+ expiry;
			servletContextInfo += "<div><b> 6. isNew : </b>"
					+ httpSession.isNew();
			servletContextInfo += "<div><b> 7. Http Session Arrtibute</b></div>";

			Enumeration<String> attributeNames = httpSession
					.getAttributeNames();
			while (attributeNames.hasMoreElements()) {
				String key = (String) attributeNames.nextElement();
				String value = (String) httpSession.getAttribute(key);
				servletContextInfo += "<div style='margin-left:100px;'><b>"
						+ key + "</b> : " + value + "</div>";
			}
		} else {
			servletContextInfo += "Http Session Already Remove..!!!";
		}
		return servletContextInfo;
	}

	/**
	 * @param request
	 * @return create New HttpSession Object if not present
	 */
	public static HttpSession createHttpSession(HttpServletRequest request) {
		return createHttpSession(request, null, null, null, false);
	}

	/**
	 * @param request
	 * @param sessionKey
	 * @param sessionValue
	 * @return
	 */
	public static HttpSession createHttpSession(HttpServletRequest request,
			String sessionKey, String sessionValue) {
		return createHttpSession(request, sessionKey, sessionValue, null, false);
	}

	/**
	 * @param request
	 * @param sessionKey
	 * @param sessionValue
	 * @param isNew
	 * @return
	 */
	public static HttpSession createHttpSession(HttpServletRequest request,
			String sessionKey, String sessionValue, boolean isNew) {
		return createHttpSession(request, sessionKey, sessionValue, null, isNew);
	}

	/**
	 * @param request
	 * @param isNew
	 * @return
	 */
	public static HttpSession createHttpSession(HttpServletRequest request,
			boolean isNew) {
		return createHttpSession(request, null, null, null, isNew);
	}

	/**
	 * @param request
	 * @param sessionKey
	 * @param sessionValue
	 * @param maxIntervalTime
	 * @param isNew
	 * @return
	 */
	public static HttpSession createHttpSession(HttpServletRequest request,
			String sessionKey, String sessionValue, Integer maxIntervalTime,
			boolean isNew) {

		HttpSession httpSession = null;
		if (isNew) {
			httpSession = request.getSession(isNew);
		} else {
			httpSession = request.getSession();
		}

		if ((sessionKey != null && !sessionKey.isEmpty())
				&& (sessionValue != null && !sessionValue.isEmpty())) {
			httpSession.setAttribute(sessionKey, sessionValue);
		}

		if (maxIntervalTime != null) {
			httpSession.setMaxInactiveInterval(maxIntervalTime);
		}

		return httpSession;
	}

	/**
	 * @param httpSession
	 * @param sessionKey
	 * @param sessionValue
	 */
	public static void setHttpSessionAttribute(HttpSession httpSession,
			String sessionKey, String sessionValue) {
		setHttpSessionAttribute(httpSession, sessionKey, sessionValue, null,
				false);
	}

	/**
	 * @param httpSession
	 * @param sessionKey
	 * @param sessionValue
	 * @param isNew
	 */
	public static void setHttpSessionAttribute(HttpSession httpSession,
			String sessionKey, String sessionValue, boolean isNew) {
		setHttpSessionAttribute(httpSession, sessionKey, sessionValue, null,
				isNew);
	}

	/**
	 * @param httpSession
	 * @param sessionKey
	 * @param sessionValue
	 * @param maxIntervalTime
	 * @param isNew
	 */
	public static void setHttpSessionAttribute(HttpSession httpSession,
			String sessionKey, String sessionValue, Integer maxIntervalTime,
			boolean isNew) {

		if ((sessionKey != null && !sessionKey.isEmpty())
				&& (sessionValue != null && !sessionValue.isEmpty())) {
			httpSession.setAttribute(sessionKey, sessionValue);
		}

		if (maxIntervalTime != null) {
			httpSession.setMaxInactiveInterval(maxIntervalTime);
		}

	}

	/**
	 * @param request
	 * @return
	 */
	public static HttpSession getHttpSession(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		return httpSession;
	}

	/**
	 * @param request
	 * @return
	 */
	public static HttpSession getHttpSession(HttpServletRequest request,
			boolean isNew) {
		HttpSession httpSession = request.getSession(isNew);
		return httpSession;
	}
}
