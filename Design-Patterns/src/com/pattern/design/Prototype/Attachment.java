package com.pattern.design.Prototype;

import java.io.Serializable;

/**
 * Created by peixuan.xie on 2017/9/21.
 */
public class Attachment implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("下载附件，文件名为" + name);
    }
}
