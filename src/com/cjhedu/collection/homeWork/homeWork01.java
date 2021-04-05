package com.cjhedu.collection.homeWork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author: phil
 * @ProjectName: collection
 * @Date: 2021/4/5
 */
@SuppressWarnings({"all"})
public class homeWork01 {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万，数百名印度圣徒赴恒河\"圣河\"引起命中担忧");
        News news2 = new News("男子突然象棋两个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        //将数据加入到arrayList集合中
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        //进行倒序排序
      int size = arrayList.size();
        for (int i = size-1; i >=0; i--) {
           // System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
        //写一个方法，处理实现新闻标题process处理

    }

    public static String processTitle(String title){
        if (title==null){
            return "";
        }

        if (title.length()>15){
            return title.substring(0,15)+"...";
        }else{
            return title;
        }
    }
}
class News{
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" +"\t"+ title ;
    }
}