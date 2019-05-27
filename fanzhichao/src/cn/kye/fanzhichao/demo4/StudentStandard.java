package cn.kye.fanzhichao.demo4;
//一个标准类的通常包括以下四个部分：
//1、所有成员变量都要使用private关键字修饰
//2、为每一个成员变量编写一对Getter/Setter方法
//3、编写一个无参数的构造方法
//4、编写一个全参数的构造方法

//这样标准的类叫做Java Bean

public class StudentStandard {
    private String name;
    private int age;

    public StudentStandard() {
    }

    public StudentStandard(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
