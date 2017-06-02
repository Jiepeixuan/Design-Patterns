package com.pattern.design.AbstractFactory;


/**
 * <p>Title: SummerSkinFactory</p>
 * <p>Description: Summer皮肤工厂：具体工厂 </p>
 * @author peixuan.xie
 * @date 2017年5月26日下午4:59:36
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
