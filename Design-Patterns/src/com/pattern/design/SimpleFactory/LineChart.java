package com.pattern.design.SimpleFactory;


/**
* <p>Title: LineChart</p>
* <p>Description: ����ͼ�ࣺ�����Ʒ��  </p> 
* @author peixuan.xie
* @date 2017��5��25������9:44:02
*/
public class LineChart implements Chart{

	public LineChart() {
		System.out.println("��������ͼ");
	}
	
	@Override
	public void display() {
		System.out.println("��ʾ����ͼ");
	}

}
