package com.pattern.design.FactoryMethod;

/**
* <p>Title: DatabaseLogger</p>
* <p>Description: ���ݿ���־��¼���������Ʒ</p> 
* @author peixuan.xie
* @date 2017��5��25������10:09:44
*/
public class DatabaseLogger implements Logger{

	@Override
	public void writeLog() {

		System.out.println("���ݿ���־��¼��");
	}

}
