package com.example.log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4JDemo {

	private static Logger logger = LogManager.getLogger(Log4JDemo.class);

	public static void main(String[] args) {
		logger.info("This Is My First Log4j Info Demo...!!!");
		
		logger.info("Test123...!!!");
		
	}

}
