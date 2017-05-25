package com.pattern.design.FactoryMethod;

/**
* <p>Title: DatabaseLoggerFactory</p>
* <p>Description: ���ݿ���־��¼�������ࣺ���幤��</p> 
* @author peixuan.xie
* @date 2017��5��25������10:15:38
*/
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		System.out.println("�������ݿ���־����");
		Logger logger=new DatabaseLogger();
		return logger;
	}


}
