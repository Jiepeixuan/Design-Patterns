package com.pattern.design.FactoryMethod;

/**
* <p>Title: FileLogger</p>
* <p>Description: ���ݿ���־��¼���������Ʒ</p> 
* @author peixuan.xie
* @date 2017��5��25������10:10:04
*/
public class FileLogger implements Logger{

	@Override
	public void writeLog() {

		System.out.println("�ļ���־��¼��");
	}

}
