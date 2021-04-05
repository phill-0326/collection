package com.cjhedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/3/27
 */
public class pratice01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello"+i);
        }
      //  System.out.println("list集合："+list);

        //在2号位插入元素
        list.add(1,"卡卡卡卡");
        System.out.println(list);
        //获取五号为元素
        System.out.println(list.get(4));
        //删除第六号元素
        System.out.println(list.remove(5));
        //修改第七个元素
        list.set(6,"aaaaa");
        System.out.println(list);

        //用迭代器遍历list
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.print(next);
        }


    }
}
