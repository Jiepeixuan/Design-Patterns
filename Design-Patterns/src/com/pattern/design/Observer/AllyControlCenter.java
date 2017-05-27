package com.pattern.design.Observer;

import java.util.HashSet;
import java.util.Set;

/**
* <p>Title: AllyControlCenter</p>
* <p>Description: ս�ӿ��������ࣺĿ����</p> 
* @author peixuan.xie
* @date 2017��5��27������9:48:30
*/
abstract class AllyControlCenter {

	protected String allyName;//ս������
	protected Set<Observer> players=new HashSet<Observer>();
	
	public HashSet<Observer> getPlayers() {
		return (HashSet<Observer>) players;
	}
	public void setPlayers(HashSet<Observer> players) {
		this.players = players;
	}
	
	public void join(Observer observer) {
		System.out.println(observer.getName() + "����" + this.allyName + "ս�ӣ�");
		players.add(observer);
	}
	
	public void quit(Observer observer) {
		System.out.println(observer.getName() + "�˳�" + this.allyName + "ս�ӣ�"); 
		players.remove(observer);
	}
	
	public abstract void notifyObserver(Player player);
}
