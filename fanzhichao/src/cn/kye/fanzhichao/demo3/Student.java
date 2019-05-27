package cn.kye.fanzhichao.demo3;
/*一个类需要包括属性和行为
成员变量（属性）
成员方法（行为） public void (成员方法没有static)
public void eat(){}
public void sleep(){}
注意事项：
1、成员变量写在类中，方法外；不加static
2、局部变量写在方法中
 */

public class Student {
    //成员变量
    String name;
    int age;

    public void eat() {
        System.out.println("吃饭饭");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void study() {
        System.out.println("学习习");
    }


    public static void main(String[] args) {

    }
}
