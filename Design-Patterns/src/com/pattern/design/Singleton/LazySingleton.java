package com.pattern.design.Singleton;


/**
* <p>Title: LazySingleton</p>
* <p>Description: 假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，均能通过instance == null的判断。由于实现了synchronized加锁机制，线程A进入synchronized锁定的代码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想，因此需要进行进一步改进，在synchronized中再进行一次(instance == null)判断，这种方式称为双重检查锁定(Double-Check Locking)</p> 
* @author peixuan.xie
* @date 2017年5月26日下午5:20:22
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
