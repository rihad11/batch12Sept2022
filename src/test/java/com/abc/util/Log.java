package com.abc.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	// Loggers - responsible for record the logs
	// Appenders - record log event and put this in a destination
	// layouts - how the log data/output should look

	/*
	 * 
	 * log events/levels - categorize the logs by their severity/impact
	 * 
	 * 
	 * 1.fatal 2.error 3.warn 4.info 5.debug
	 * 
	 */

	private static final Logger Log = LogManager.getLogger(Log.class);

	public static void info(String message) {
		Log.info(message);
	}

	public static void warn(String message) {
		Log.warn(message);
	}

	public static void error(String message) {
		Log.error(message);
	}

	public static void fatal(String message) {
		Log.fatal(message);
	}

	public static void debug(String message) {
		Log.debug(message);
	}

}
