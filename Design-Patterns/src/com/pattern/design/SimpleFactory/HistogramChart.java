package com.pattern.design.SimpleFactory;

/**
* <p>Title: HistogramChart</p>
* <p>Description: ��״ͼ�ࣺ�����Ʒ�� </p> 
* @author peixuan.xie
* @date 2017��5��25������9:40:16
*/
public class HistogramChart implements Chart{

	public HistogramChart() {
		System.out.println("������״ͼ��");
	}
	
	@Override
	public void display() {
		System.out.println("��ʾ��״ͼ��");
	}

}
