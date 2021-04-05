package com.cjhedu.collection.homeWork;

import java.util.*;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/4/5
 */
@SuppressWarnings({"all"})
public class homeWork03 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);

        hashMap.replace("jack", 650, 2600);
        System.out.println(hashMap);
        //为员工工资加100
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            //更新价格
            hashMap.put(key, (Integer) hashMap.get(key) + 100);
        }
        System.out.println(hashMap);

        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        System.out.println("遍历所有工资：");
        Collection values = hashMap.values();
        for (Object o :values) {
            System.out.println("所有工资为："+o);
        }


    }
}
