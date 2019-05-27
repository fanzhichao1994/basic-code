package cn.kye.fanzhichao.demo1;

public class HelloWorld {
   public String fans;
    int chaos;
    //switch 练习
    public void swit(int fan) {
        switch (fan) {
            case 1:
                System.out.println("you are good");
                break;
            case 2:
                System.out.println("we are good");
                break;
            default:
                System.out.println("shuru wrong");
                break;
        }
    }

    //if else 循环练习
    public  void chengji() {
        int score = 81;
        if (score < 60 && score >= 0) {
            System.out.println("不及格");
        } else if (score >= 60 && score < 70) {
            System.out.println("良");
        } else if (score >= 70 && score < 80) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("很优秀");
        } else if (score >= 90 && score <= 100) {
            System.out.println("超优秀");
        } else {
            System.out.println("成绩不符合规范");
        }
    }

    // if else 语句练习
    public  void son() {
        int aa = 10;
        if (aa > 20) {
            System.out.println("you are too large");
        } else {
            System.out.println("bingo,you are who am i find");
        }
        System.out.println("this is the son void");
    }

    //第二次测试
    public  void father() {
        System.out.println("Hello World");
        int x = 100;
        System.out.println(x);
        int m = 50;
        int y = m--;
        System.out.println(y);
        System.out.println(m);
        System.out.println("==================");
    }

    //第一次测试
    public  void mother() {
        int z = 10;
        z = z % 3;
        System.out.println(z);
        int a = 3;
        a += 4;
        System.out.println(a);
    }

    /*public static void main(String[] args) {
        father();
        mother();
        System.out.println("fffffff");
        son();
        System.out.println("chengji NEXT");
        chengji();

    }*/
}
