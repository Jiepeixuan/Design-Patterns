package com.pattern.design.FactoryMethod;

/**
* <p>Title: DatabaseLoggerFactory</p>
* <p>Description: 数据库日志记录器工厂类：具体工厂</p> 
* @author peixuan.xie
* @date 2017年5月25日上午10:15:38
*/
public class DatabaseLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		System.out.println("创建数据库日志工厂");
		Logger logger=new DatabaseLogger();
		return logger;
	}


}
