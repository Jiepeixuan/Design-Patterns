package com.pattern.design.Builder;

/**
  *@Description:角色建造器：抽象建造者
  *@author peixuan.xie
  *@time 2017/6/5 13:49
  */
public abstract class ActorBuilder {

    protected Actor actor=new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }
}
