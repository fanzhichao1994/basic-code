package cn.kye.fanzhichao.demo06;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static void main(String[] args) {
        int num = math();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入猜测数字");
            int x = scanner.nextInt();
            if (num == x) {
                System.out.println("Bingo");
                break;
            } else if (x > num) {
                System.out.println("too large");
            } else {
                System.out.println("too small");

            }
        }
    }

    public static int math() {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        System.out.println("num：" + num);
        return num;

    }
}
