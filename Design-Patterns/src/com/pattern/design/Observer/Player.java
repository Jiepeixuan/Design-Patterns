package com.pattern.design.Observer;

public class Player implements Observer{
	private String name;
	
	public Player(String name) {
		this.name=name;
	}

	@Override
	public String getName() {

		return this.name;
	}

	@Override
	public void setName(String name) {

		this.name=name;
	}

	@Override
	public void help() {
		
		System.out.println("���ס��" + this.name + "�����㣡");  
	}

	@Override
	public void beAttacked(AllyControlCenter acc) {
		
		System.out.println(this.name + "��������");  
        acc.notifyObserver(this);    
	}

}
