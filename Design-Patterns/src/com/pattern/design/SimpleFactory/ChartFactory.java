package com.pattern.design.SimpleFactory;

/**
* <p>Title: ChartFactory</p>
* <p>Description: 图表工厂类：工厂类  </p> 
* @author peixuan.xie
* @date 2017年5月25日上午9:49:09
*/
public class ChartFactory {

	public static Chart getChart(String type){
		Chart chart=null;
		
		if(type.equalsIgnoreCase("histogram")){
			chart=new HistogramChart();
			System.out.println("初始化设置柱状图！");
		}else if (type.equalsIgnoreCase("pie")) {
			chart=new PieChart();
			System.out.println("初始化设置饼状图！");
		}else if (type.equalsIgnoreCase("line")) {
			chart=new LineChart();
			System.out.println("初始化设置折线图！");
		}
		
		return chart;
	}
}
