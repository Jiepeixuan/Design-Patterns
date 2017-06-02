package com.pattern.design.FactoryMethod;

/**
 * <p>Title: FileLoggerFactory</p>
 * <p>Description: 文件日志记录器工厂类：具体工厂 </p>
 * @author peixuan.xie
 * @date 2017年5月25日上午10:15:57
 */
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		System.out.println("创建文件日志工厂");
		Logger logger=new FileLogger();
		return logger;
	}

}
