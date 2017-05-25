package com.pattern.design.SimpleFactory;


/**
* <p>Title: LineChart</p>
* <p>Description: 折线图类：具体产品类  </p> 
* @author peixuan.xie
* @date 2017年5月25日上午9:44:02
*/
public class LineChart implements Chart{

	public LineChart() {
		System.out.println("创建折线图");
	}
	
	@Override
	public void display() {
		System.out.println("显示折线图");
	}

}
