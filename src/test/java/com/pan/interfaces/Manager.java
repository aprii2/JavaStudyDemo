package com.pan.interfaces;

import java.util.Date;

public class Manager extends Employee{
    private Integer bonus;

    public Manager() {
        System.out.println("执行Manager的无参数方法");
    }

    public Manager(String name, Date hireDay,Integer salary,Integer bonus) {
//        setName(name);
//        setHireDay(hireDay);
//        setSalary(salary);
        super(name,hireDay,salary);
        this.bonus = bonus;
        System.out.println("执行 Manager 的有参构造方法");
    }
    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    // 子类可以覆盖父类的方法，我们称为复写或者覆盖，可以使用 @Override 注解
    @Override
    public Integer getSalary() {
        if (bonus == null) {
            return super.getSalary();
        }
        return super.getSalary() + bonus;
    }
}
