package com.pattern.design.Observer;


/**
* <p>Title: Observer</p>
* <p>Description: ����۲���</p> 
* @author peixuan.xie
* @date 2017��5��27������9:46:47
*/
public interface Observer {
	
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(AllyControlCenter acc); //�������ܹ�������  
}
