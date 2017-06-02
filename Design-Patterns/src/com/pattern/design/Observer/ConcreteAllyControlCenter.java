package com.pattern.design.Observer;

/**
 * <p>Title: ConcreteAllyControlCenter</p>
 * <p>Description: 具体战队控制中心类：具体目标类 </p>
 * @author peixuan.xie
 * @date 2017年5月27日上午9:58:50
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName + "战队组建成功！");
		System.out.println("----------------------------");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(Player player) {

		if(players.contains(player)){
			System.out.println(this.allyName + "战队紧急通知，盟友" + player.getName() + "遭受敌人攻击！");
		}else {
			System.out.println(this.allyName + "战队紧急通知，前盟友" + player.getName() + "遭受敌人攻击！");
		}
		//遍历观察者集合，调用每一个盟友（自己除外）的支援方法
		for(Object obs : players) {
			if (!((Observer)obs).getName().equalsIgnoreCase(player.getName())) {
				((Observer)obs).help();
			}
		}
	}

}
