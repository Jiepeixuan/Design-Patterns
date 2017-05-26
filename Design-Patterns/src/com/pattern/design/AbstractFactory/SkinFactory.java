package com.pattern.design.AbstractFactory;


/**
* <p>Title: SkinFactory</p>
* <p>Description: 界面皮肤工厂接口：抽象工厂 </p> 
* @author peixuan.xie
* @date 2017年5月26日下午4:57:46
*/
public interface SkinFactory {
	public Button createButton();  
    public TextField createTextField();  
    public ComboBox createComboBox();  
}
