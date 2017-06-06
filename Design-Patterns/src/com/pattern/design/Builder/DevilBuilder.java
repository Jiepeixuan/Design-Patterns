package com.pattern.design.Builder;

/**
  *@Description:恶魔角色建造器：具体建造者
  *@author peixuan.xie
  *@time 2017/6/5 14:37
  */
public class DevilBuilder extends ActorBuilder{
    public  void buildType()
    {
        actor.setType("恶魔");
    }
    public  void buildSex()
    {
        actor.setSex("妖");
    }
    public  void buildFace()
    {
        actor.setFace("丑陋");
    }
    public  void buildCostume()
    {
        actor.setCostume("黑衣");
    }
    public  void buildHairstyle()
    {
        actor.setHairstyle("光头");
    }
}
