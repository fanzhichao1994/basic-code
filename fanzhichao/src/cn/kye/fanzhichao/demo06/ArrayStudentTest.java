package cn.kye.fanzhichao.demo06;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayStudentTest {
    public static void main(String[] args) {
        //初始化四个对象，存入数组
        ArrayList<Student> list =new ArrayList();
        Student stu01 = new Student("fanzhichao",20);
        Student stu02 = new Student("yinjingjing",21);
        Student stu03 = new Student("shengskaz",22);
        Student stu04 = new Student("asfafao",23);
        list.add(stu01);
        list.add(stu02);
        list.add(stu03);
        list.add(stu04);
        //遍历对象集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+" 年龄:"+stu.getAge());

        }

    }
}
