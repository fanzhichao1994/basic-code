package cn.kye.fanzhichao.demo5_API;

import java.util.Random;

public class Employee {

    int nm = 10;
    int num = 100;
    int mm = 300;
    Random random01 = new Random();

    public int method(int a, int b) {
        System.out.println("This is a method from Employee");
        return a + b;
    }

    public int random(int a ) {
        int randxx = random01.nextInt(a);
        return randxx;
    }
}
