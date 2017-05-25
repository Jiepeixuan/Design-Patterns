package com.pattern.design.SimpleFactory;


public class Client {
	public static void main(String[] args) {
		Chart chart;
		String type = XMLUtil.getChartType(); //读取配置文件中的参数  
        chart = ChartFactory.getChart(type); //创建产品对象  
		chart.display();
	}
}
