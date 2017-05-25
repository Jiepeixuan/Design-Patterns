package com.pattern.design.FactoryMethod;

/**
* <p>Title: FileLoggerFactory</p>
* <p>Description: �ļ���־��¼�������ࣺ���幤�� </p> 
* @author peixuan.xie
* @date 2017��5��25������10:15:57
*/
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		System.out.println("�����ļ���־����");
		Logger logger=new FileLogger();
		return logger;
	}

}
