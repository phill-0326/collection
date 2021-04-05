package com.cjhedu.collection.Practice;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/3/27
 */
public class homeWork02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Employee employee1 = new Employee(2021,03,25,"jack",2000);
        Employee employee2 = new Employee(2011,03,26,"mary",2500);
        Employee employee3 = new Employee(2021,06,25,"jack",2000);
        Employee employee4 = new Employee(2020,03,15,"tom",5000);
        Employee employee5 = new Employee(2018,05,28,"smith",5000);
        Employee employee6 = new Employee(2019,02,29,"buffer",5000);
        Employee employee7 = new Employee(2020,01,12,"Zion",5000);

        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        hashSet.add(employee4);
        hashSet.add(employee5);
        hashSet.add(employee6);
        hashSet.add(employee7);

        //遍历
        for (Object o :hashSet) {
            System.out.println(o);
        }


    }
}
class Employee extends MyDate{
    private String name;
    private double sal;

    public Employee(int year, int month, int day, String name, double sal) {
        super(year, month, day);
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "姓名：" + name + '\t' + " 薪水：" + sal +"\tBirthday:  " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
 class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return
                 year +
                "-" + month +
                "-" + day
               ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}