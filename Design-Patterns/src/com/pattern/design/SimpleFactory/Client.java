package com.pattern.design.SimpleFactory;


public class Client {
	public static void main(String[] args) {
		Chart chart;
		String type = XMLUtil.getChartType(); //��ȡ�����ļ��еĲ���  
        chart = ChartFactory.getChart(type); //������Ʒ����  
		chart.display();
	}
}
