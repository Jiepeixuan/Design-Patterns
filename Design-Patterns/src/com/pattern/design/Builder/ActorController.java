package com.pattern.design.Builder;

/**
  *@Description:游戏角色创建控制器：指挥者
  *@author peixuan.xie
  *@time 2017/6/5 14:31
  */
public class ActorController {

    public Actor construct(ActorBuilder ab)
    {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor=ab.createActor();
        return actor;
    }

}
