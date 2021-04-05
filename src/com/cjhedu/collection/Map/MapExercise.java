package com.cjhedu.collection.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/3/28
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Employee(1,"jack",100000));
        hashMap.put(2,new Employee(2,"tom",20000));
        hashMap.put(3,new Employee(3,"smith",15000));

        //遍历
        System.out.println("=====方法一 增强for=====");
        for (Object key : hashMap.keySet()) {
            Employee emp = (Employee) hashMap.get(key);
            if (emp.getSalary()>18000){
                System.out.println(key+"-"+hashMap.get(key));
            }
        }

        System.out.println("======方法二 迭代器=====");
        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            //通过entry 取得key 和 value
            Map.Entry entry = (Map.Entry) iterator.next();
            Employee emp = (Employee) entry.getValue();
            if (emp.getSalary()>18000){
                System.out.println(emp);
            }

        }

    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name=" + name + '\t' +
                ", salary=" + salary
                ;
    }
}