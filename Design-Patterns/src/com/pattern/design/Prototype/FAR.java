package com.pattern.design.Prototype;

/**
 * Created by peixuan.xie on 2017/9/21.
 */
public class FAR implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        OfficialDocument  far = null;
        try
        {
            far  = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException  e)
        {
            System.out.println("不支持复制！");
        }
        return  far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
