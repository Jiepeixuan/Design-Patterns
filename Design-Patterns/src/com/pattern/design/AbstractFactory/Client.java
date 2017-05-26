package com.pattern.design.AbstractFactory;

public class Client {
	public static void main(String[] args) {
		SkinFactory skinFactory=new SpringSkinFactory();
		Button bt;  
        TextField tf;  
        ComboBox cb;  
        bt=skinFactory.createButton();
        tf=skinFactory.createTextField();
        cb=skinFactory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
	}
}
