package cn.kye.fanzhichao.demo2;

public class Method {
    public static void main(String[] args) {
        printMethod(10, 20);
        System.out.println("=========");
        math01();
        int mmx =getsum(10,50);
        System.out.println(mmx);
        math2(20,50);
    }

    //有参数的方法
    public static void printMethod(int a, int b) {
        int result = a * b;
        System.out.println("结果是：" + result);

    }

    //无参数的方法
    public static void math01() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello:" + i);
        }
    }
    // 有返回值的方法
    public static int getsum (int aa, int bb) {
        int result = aa*bb;
        return result;
    }
    //无返回值的方法
    public static void math2(int aaa ,int bbb){
       int resulta = aaa*bbb;
        System.out.println(resulta);


    }
}
