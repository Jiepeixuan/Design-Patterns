package com.pattern.design.Singleton;


/**
 * <p>Title: EagerSingleton</p>
 * <p>Description:饿汉式单例,在定义静态变量的时候实例化单例类，因此在类加载的时候就已经创建了单例对象 </p>
 * @author peixuan.xie
 * @date 2017年5月26日下午5:17:18
 */
public class EagerSingleton {

	private static final EagerSingleton instance=new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance(){
		return instance;
	}
}
