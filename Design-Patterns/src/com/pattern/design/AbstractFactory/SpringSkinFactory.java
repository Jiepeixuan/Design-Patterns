package com.pattern.design.AbstractFactory;


/**
* <p>Title: SpringSkinFactory</p>
* <p>Description: SpringƤ�����������幤��</p> 
* @author peixuan.xie
* @date 2017��5��26������4:58:42
*/
public class SpringSkinFactory implements SkinFactory{

	public Button createButton() {  
        return new SpringButton();  
    }  

    public TextField createTextField() {  
        return new SpringTextField();  
    }  

    public ComboBox createComboBox() {  
        return new SpringComboBox();  
    }  

}
