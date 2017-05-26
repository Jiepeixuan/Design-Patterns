package com.pattern.design.Singleton;


/**
* <p>Title: EagerSingleton</p>
* <p>Description:����ʽ����,�ڶ��徲̬������ʱ��ʵ���������࣬���������ص�ʱ����Ѿ������˵������� </p> 
* @author peixuan.xie
* @date 2017��5��26������5:17:18
*/
public class EagerSingleton {

	private static final EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
