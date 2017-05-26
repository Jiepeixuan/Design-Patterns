package com.pattern.design.AbstractFactory;


/**
* <p>Title: SpringSkinFactory</p>
* <p>Description: Spring皮肤工厂：具体工厂</p> 
* @author peixuan.xie
* @date 2017年5月26日下午4:58:42
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
