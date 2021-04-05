package com.cjhedu.collection.homeWork;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/4/5
 */
@SuppressWarnings({"all"})
public class homeWork02 {
    public static void main(String[] args) {
        //添加元素
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("大众",200010));
        arrayList.add(new Car("马自达",200100));
        arrayList.add(new Car("宝马",2000000));
        arrayList.add(new Car("宾利",6000000));
//        System.out.println("刚开始集合的情况：");
//        for (Object o :arrayList) {
//            System.out.println(o);
//        }
        //移除指定的元素
     //   System.out.println(arrayList.remove(1));

        //查找元素是否存在
     //   System.out.println(arrayList.contains("保时捷"));
        //获取元素的个数
      //  System.out.println(arrayList.size());

        //判断是否为空
 //       System.out.println(arrayList.isEmpty());

        //清空
    //    arrayList.clear();

        //添加多个元素是否存在
//        Car car1 = new Car("BMW",400000);
//        Car car2 = new Car("Porsche",900000);




    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + "\t" +
                ", price=" + price ;
    }
}