package com.pattern.design.Observer;

import java.util.HashSet;
import java.util.Set;

/**
* <p>Title: AllyControlCenter</p>
* <p>Description: 战队控制中心类：目标类</p> 
* @author peixuan.xie
* @date 2017年5月27日上午9:48:30
*/
abstract class AllyControlCenter {

	protected String allyName;//战队名称
	protected Set<Observer> players=new HashSet<Observer>();
	
	public HashSet<Observer> getPlayers() {
		return (HashSet<Observer>) players;
	}
	public void setPlayers(HashSet<Observer> players) {
		this.players = players;
	}
	
	public void join(Observer observer) {
		System.out.println(observer.getName() + "加入" + this.allyName + "战队！");
		players.add(observer);
	}
	
	public void quit(Observer observer) {
		System.out.println(observer.getName() + "退出" + this.allyName + "战队！"); 
		players.remove(observer);
	}
	
	public abstract void notifyObserver(Player player);
}
