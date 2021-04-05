package com.cjhedu.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/3/27
 * list的简单应用
 */
public class pritice02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("水浒传","施耐庵",60));
        list.add(new Book("三国志","吴承恩",200));
        list.add(new Book("西游记","郭冠中",10));

       // System.out.println(list);
       //按照书的价格进行冒泡排序
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size() -1-i; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
        //遍历list
        for (Object o :list) {
            System.out.println(o);
        }


    }
}
class Book{
    private String bName;
    private String name;
    private int price;

    public Book(String bName, String name, int price) {
        this.bName = bName;
        this.name = name;
        this.price = price;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "书名：" + bName + '\t' +
                "作者：" + name + '\t' +
                "价格：" + price
               ;
    }
}
