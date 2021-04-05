//package com.cjhedu.collection;
//
//import java.util.HashSet;
//import java.util.Objects;
//
///**
// * @author: phil
// * @ProjectName: collection
// * @Date: 2021/3/27
// * hashset 的训练
// */
//public class homeWork {
//    public static void main(String[] args) {
//       com.cjhedu.collection.Practice.Employee employee1 = new com.cjhedu.collection.Practice.Employee("jack",23);
//       com.cjhedu.collection.Practice.Employee employee2 = new com.cjhedu.collection.Practice.Employee("jack",23);
//       com.cjhedu.collection.Practice.Employee employee3 = new com.cjhedu.collection.Practice.Employee("tom",34);
//
//        HashSet hashSet = new HashSet();
//        hashSet.add(employee1);
//        hashSet.add(employee2);
//        hashSet.add(employee3);
//
//        for (Object o :hashSet) {
//            System.out.println(o);
//        }
//
//    }
//}
//class Employee{
//    private String name;
//    private int age;
//
//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    //如果name和age值相同，则返回相同的hash值
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        com.cjhedu.collection.Practice.Employee employee = (com.cjhedu.collection.Practice.Employee) o;
//        return age == employee.age &&
//                Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//}