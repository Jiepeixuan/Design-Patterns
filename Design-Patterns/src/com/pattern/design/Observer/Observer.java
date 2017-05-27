package com.pattern.design.Observer;


/**
* <p>Title: Observer</p>
* <p>Description: 抽象观察类</p> 
* @author peixuan.xie
* @date 2017年5月27日上午9:46:47
*/
public interface Observer {
	
	public String getName();
	public void setName(String name);
	public void help();
	public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法  
}
