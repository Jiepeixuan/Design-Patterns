package com.pattern.design.SimpleFactory;

/**
* <p>Title: PieChart</p>
* <p>Description: ��״ͼ�ࣺ�����Ʒ��  </p> 
* @author peixuan.xie
* @date 2017��5��25������9:41:57
*/
public class PieChart implements Chart{
	
	public PieChart() {
		System.out.println("������״ͼ");
	}

	@Override
	public void display() {

		System.out.println("��ʾ��״ͼ");
	}

}
