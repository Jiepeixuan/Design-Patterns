package com.pattern.design.Prototype;

/**
 * Created by peixuan.xie on 2017/9/21.
 */
interface OfficialDocument extends Cloneable {
    public OfficialDocument clone();

    public void display();
}
