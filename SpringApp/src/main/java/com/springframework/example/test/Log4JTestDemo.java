package com.springframework.example.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4JTestDemo {

	private static Logger logger = LogManager.getLogger(Log4JTestDemo.class);

	public static void main(String[] args) {
		logger.info("This Is My First Log4j Info Demo...!!!");
	}

}
