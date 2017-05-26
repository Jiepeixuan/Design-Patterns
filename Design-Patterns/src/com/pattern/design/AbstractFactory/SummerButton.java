package com.pattern.design.AbstractFactory;


/**
* <p>Title: SummerButton</p>
* <p>Description: Summer按钮类：具体产品</p> 
* @author peixuan.xie
* @date 2017年5月26日下午4:52:24
*/
public class SummerButton implements Button {

	@Override
	public void display() {
		System.out.println("显示浅蓝色按钮。");  

	}

}
