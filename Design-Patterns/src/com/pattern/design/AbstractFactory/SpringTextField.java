package com.pattern.design.AbstractFactory;


/**
* <p>Title: SpringTextField</p>
* <p>Description: Spring文本框类：具体产品</p> 
* @author peixuan.xie
* @date 2017年5月26日下午4:54:38
*/
public class SpringTextField implements TextField{

	@Override
	public void display() {
		System.out.println("显示绿色边框文本框。");  
		
	}

}
