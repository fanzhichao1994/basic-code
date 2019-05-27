package cn.kye.fanzhichao.demo2;

public class MathPratice01 {
    public static void main(String[] args) {
        getSum();
        System.out.println(getSum());
        System.out.println("========");
        printCount(10);
    }

    public static int getSum() {
        int sum=0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
    public static void printCount(int num){
        for (int i = 1; i < num+1; i++) {
            System.out.println("HelloWorld:"+i);
        }
    }
}
