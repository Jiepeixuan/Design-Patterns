package com.pattern.design.Observer;

public class Client {

	public static void main(String[] args) {
		AllyControlCenter acc;  
        acc = new ConcreteAllyControlCenter("��ӹȺ��");  

        //�����ĸ��۲��߶���  
        Observer player1,player2,player3,player4;  

        player1 = new Player("���");  
        acc.join(player1);  

        player2 = new Player("�����");  
        acc.join(player2);  

        player3 = new Player("���޼�");  
        acc.join(player3);  

        player4 = new Player("����");  
        acc.join(player4);  

        //ĳ��Ա���ܹ���  
        player1.beAttacked(acc); 
        acc.quit(player1);
        player1.beAttacked(acc); 
	}
}
