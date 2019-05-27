package cn.kye.fanzhichao.demo5_API;
//定义一个子类

public class Assistant extends Employee {
    int num=200;

    @Override
    public  int method(int a ,int b ) {
        int num=20;
        System.out.println(num);//调用子类（自己）的局部变量num
        System.out.println(this.num);//调用子类（自己）的成员变量num
        System.out.println(super.num);//调用父类的成员变量num
        System.out.println("this is override methon");
        System.out.println(super.mm);
        return a*b;
    }
}
