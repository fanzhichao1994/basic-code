package cn.kye.fanzhichao.demo3;

//import cn.kye.fanzhichao.demo3.Student;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "赵丽颖";
        stu.age = 18;
        stu.eat();
        stu.sleep();
        System.out.println(stu.name);
        System.out.println(stu.age);
    }
}
