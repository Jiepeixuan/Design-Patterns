package com.pattern.design.Builder;

/**
  *@Description:具体建造者
  *@author peixuan.xie
  *@time 2017/6/5 14:35
  */
public class HeroBuilder extends ActorBuilder{
    public  void buildType()
    {
        actor.setType("英雄");
    }
    public  void buildSex()
    {
        actor.setSex("男");
    }
    public  void buildFace()
    {
        actor.setFace("英俊");
    }
    public  void buildCostume()
    {
        actor.setCostume("盔甲");
    }
    public  void buildHairstyle()
    {
        actor.setHairstyle("飘逸");
    }
}
