package com.pattern.design.Observer;

/**
* <p>Title: ConcreteAllyControlCenter</p>
* <p>Description: ����ս�ӿ��������ࣺ����Ŀ���� </p> 
* @author peixuan.xie
* @date 2017��5��27������9:58:50
*/
public class ConcreteAllyControlCenter extends AllyControlCenter {
	
	public ConcreteAllyControlCenter(String allyName) {  
        System.out.println(allyName + "ս���齨�ɹ���");  
        System.out.println("----------------------------");  
        this.allyName = allyName;  
    }  

	@Override
	public void notifyObserver(Player player) {
		
		if(players.contains(player)){
    		System.out.println(this.allyName + "ս�ӽ���֪ͨ������" + player.getName() + "���ܵ��˹�����");  
    	}else {
    		System.out.println(this.allyName + "ս�ӽ���֪ͨ��ǰ����" + player.getName() + "���ܵ��˹�����"); 
		}
        //�����۲��߼��ϣ�����ÿһ�����ѣ��Լ����⣩��֧Ԯ����  
        for(Object obs : players) {
        	if (!((Observer)obs).getName().equalsIgnoreCase(player.getName())) {  
                ((Observer)obs).help();  
            }  
        }   
	}

}
