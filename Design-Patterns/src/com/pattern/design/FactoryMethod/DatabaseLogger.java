package com.pattern.design.FactoryMethod;

/**
 * <p>Title: DatabaseLogger</p>
 * <p>Description: 数据库日志记录器：具体产品</p>
 * @author peixuan.xie
 * @date 2017年5月25日上午10:09:44
 */
public class DatabaseLogger implements Logger{

	@Override
	public void writeLog() {

		System.out.println("数据库日志记录。");
	}

}
