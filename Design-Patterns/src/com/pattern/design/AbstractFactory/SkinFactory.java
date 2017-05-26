package com.pattern.design.AbstractFactory;


/**
* <p>Title: SkinFactory</p>
* <p>Description: ����Ƥ�������ӿڣ����󹤳� </p> 
* @author peixuan.xie
* @date 2017��5��26������4:57:46
*/
public interface SkinFactory {
	public Button createButton();  
    public TextField createTextField();  
    public ComboBox createComboBox();  
}
