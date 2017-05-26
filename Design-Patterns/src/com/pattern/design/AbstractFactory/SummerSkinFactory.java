package com.pattern.design.AbstractFactory;


/**
* <p>Title: SummerSkinFactory</p>
* <p>Description: SummerƤ�����������幤�� </p> 
* @author peixuan.xie
* @date 2017��5��26������4:59:36
*/
public class SummerSkinFactory implements SkinFactory{

	public Button createButton() {  
        return new SummerButton();  
    }  

    public TextField createTextField() {  
        return new SummerTextField();  
    }  

    public ComboBox createComboBox() {  
        return new SummerComboBox();  
    }  

}
