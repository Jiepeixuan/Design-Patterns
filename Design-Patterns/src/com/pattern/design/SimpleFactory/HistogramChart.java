package com.pattern.design.SimpleFactory;

/**
 * <p>Title: HistogramChart</p>
 * <p>Description: 柱状图类：具体产品类 </p>
 * @author peixuan.xie
 * @date 2017年5月25日上午9:40:16
 */
public class HistogramChart implements Chart{

	public HistogramChart() {
		System.out.println("创建柱状图！");
	}

	@Override
	public void display() {
		System.out.println("显示柱状图！");
	}

}
