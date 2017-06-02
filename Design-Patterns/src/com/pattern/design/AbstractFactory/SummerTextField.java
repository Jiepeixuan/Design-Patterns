package com.pattern.design.AbstractFactory;


/**
 * <p>Title: SummerTextField</p>
 * <p>Description: Summer文本框类：具体产品 </p>
 * @author peixuan.xie
 * @date 2017年5月26日下午4:55:08
 */
public class SummerTextField implements TextField{

	@Override
	public void display() {
		System.out.println("显示蓝色边框文本框。");

	}

}
