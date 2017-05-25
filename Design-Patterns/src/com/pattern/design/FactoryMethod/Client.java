package com.pattern.design.FactoryMethod;

public class Client {
	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
		factory=new FileLoggerFactory();
		logger=factory.createLogger();
		logger.writeLog();
	}
}
