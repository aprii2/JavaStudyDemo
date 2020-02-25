package com.pan.interfaces;

import java.util.Date;

public class MasterManager extends Manager {

    @Override
    public String getName() {
        return "【" + super.getName() + "】";
    }

    public MasterManager(String name,Date hireday,Integer salary,Integer bonus){
        super(name,hireday,salary,bonus);
        System.out.println("执行 MasterManager 的有参数构造方法");
    }

}
