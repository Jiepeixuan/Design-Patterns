package com.pattern.design.Singleton;


/**
* <p>Title: LazySingleton</p>
* <p>Description: ������ĳһ˲���߳�A���߳�B���ڵ���getInstance()��������ʱinstance����Ϊnullֵ������ͨ��instance == null���жϡ�����ʵ����synchronized�������ƣ��߳�A����synchronized�����Ĵ�����ִ��ʵ���������룬�߳�B�����Ŷӵȴ�״̬������ȴ��߳�Aִ����Ϻ�ſ��Խ���synchronized�������롣����Aִ�����ʱ���߳�B����֪��ʵ���Ѿ������������������µ�ʵ�������²��������������Υ������ģʽ�����˼�룬�����Ҫ���н�һ���Ľ�����synchronized���ٽ���һ��(instance == null)�жϣ����ַ�ʽ��Ϊ˫�ؼ������(Double-Check Locking)</p> 
* @author peixuan.xie
* @date 2017��5��26������5:20:22
*/
public class LazySingleton {
	
	private volatile static LazySingleton instance=null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(instance==null){
			synchronized (LazySingleton.class) {
				if(instance==null){
					instance=new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
