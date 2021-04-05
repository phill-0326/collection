package com.cjhedu.collection.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/3/27
 */
public class LinkedHashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥迪",200000));
        linkedHashSet.add(new Car("宝马",700000));
        linkedHashSet.add(new Car("保时捷",600000));
        linkedHashSet.add(new Car("奔驰",800000));
        linkedHashSet.add(new Car("奥迪",200000));

        //遍历
        for (Object o :linkedHashSet) {
            System.out.println(o);
        }


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return
                "name: " + name + "\t\t" +
                "price: " + price ;
    }
}