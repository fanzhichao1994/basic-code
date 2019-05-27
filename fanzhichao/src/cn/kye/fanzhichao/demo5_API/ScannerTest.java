package cn.kye.fanzhichao.demo5_API;

import java.util.Scanner;

public class ScannerTest {
    public static  int method(int a ,int b ,int c ){
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请分别三个输入数字");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int max =method(a,b,c);
        System.out.println("the max number is:"+max);

    }

}
