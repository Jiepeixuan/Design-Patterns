package com.pattern.design.AbstractFactory;


/**
 * <p>Title: SpringButton</p>
 * <p>Description: Spring按钮类：具体产品 </p>
 * @author peixuan.xie
 * @date 2017年5月26日下午4:51:46
 */
public class SpringButton implements Button {

	@Override
	public void display() {
		System.out.println("显示浅绿色按钮。");

	}

}
