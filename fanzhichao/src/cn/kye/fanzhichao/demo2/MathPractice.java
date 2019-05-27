package cn.kye.fanzhichao.demo2;

public class MathPractice {
    public static void main(String[] args) {
        boolean a = isSame(20, 30);
        System.out.println(a);
    }

    public static boolean isSame(int a, int b) {
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
}
