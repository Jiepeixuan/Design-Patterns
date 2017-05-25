package com.pattern.design.FactoryMethod;

/**
* <p>Title: FileLogger</p>
* <p>Description: 数据库日志记录器：具体产品</p> 
* @author peixuan.xie
* @date 2017年5月25日上午10:10:04
*/
public class FileLogger implements Logger{

	@Override
	public void writeLog() {

		System.out.println("文件日志记录。");
	}

}
