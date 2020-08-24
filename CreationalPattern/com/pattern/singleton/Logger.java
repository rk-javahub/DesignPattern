package com.pattern.singleton;

public class Logger implements Cloneable {
	// private constructor so no outside class create object
	private Logger() {
	}

	// Only instance of class
	private static volatile Logger logger;
	private String logMessage;

	// Return the instance of class which is only access point for outside classes
	// to access object of Logger class.
	public static Logger getInstance() {
		if (logger == null) {
			synchronized (Logger.class) {
				if (logger == null) {
					logger = new Logger();

				}
			}
		}
		return logger;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		if (this.logMessage == null) {
			this.logMessage = logMessage;
		}
	}

	// Disable cloning
	public Object clone() {
		return new CloneNotSupportedException("cloning not supported for singleton object...");
	}

}
