package com.pattern.design.SimpleFactory;

/**
* <p>Title: PieChart</p>
* <p>Description: 饼状图类：具体产品类  </p> 
* @author peixuan.xie
* @date 2017年5月25日上午9:41:57
*/
public class PieChart implements Chart{
	
	public PieChart() {
		System.out.println("创建饼状图");
	}

	@Override
	public void display() {

		System.out.println("显示饼状图");
	}

}
