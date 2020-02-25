package com.pan.interfaces;

import org.testng.annotations.Test;

import java.util.Date;

public class EmployeeTest {

    @Test
    public void testPrint() {
        Employee e1 = new Employee();
        e1.setName("员工1");
        e1.setHireDay(new Date());
        e1.setSalary(100);
        e1.printlnfo();

        Manager m1 = new Manager();
        m1.setName("经理1");
        m1.setHireDay(new Date());
        m1.setSalary(120);
        m1.setBonus(30);
        m1.printlnfo();

        Manager m2 = new Manager("经理2",new Date(),130,40);
        m2.printlnfo();
        System.out.println("我的奖金是：" + m2.getBonus());

        MasterManager mm1 = new MasterManager("总经理1",new Date(),200,60);
        mm1.printlnfo();
        System.out.println("我的奖金是：" + mm1.getBonus());


        Employee e = e1;    //员工类
        e.printlnfo();

        e = m1;             // 将子类总经理赋给父类员工类，但不能再调用子类方法
        e.printlnfo();

        Manager m3 = (Manager) e; // 需要将父类强制转换成子类。
        System.out.println(m3.getBonus());
//        System.out.println(((Manager) e).getBonus());

        e = mm1;
        e.printlnfo();

        System.out.println(e instanceof MasterManager);
        System.out.println(e instanceof  Manager);
        System.out.println(e instanceof Employee);
    }

    @Test
    public void testObjectMethod() {
        Employee employee = new Employee();
        System.out.println(employee.getClass().getName());
        System.out.println(employee.getClass().getSimpleName());
        System.out.println(employee.hashCode());
        System.out.println(employee.toString());

        int[] arr = new int[0];
        System.out.println(arr.getClass().getName());
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.hashCode());
        System.out.println(arr.toString());

        Employee employee1 = new Manager();
        System.out.println(employee1.getClass().getName());
        System.out.println(employee1.getClass().getSimpleName());
        System.out.println(employee1.hashCode());
        System.out.println(employee1.toString());
    }
}
