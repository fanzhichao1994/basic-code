package cn.kye.fanzhichao.demo2;

public class MathPractice02 {
    public static void main(String[] args) {
        int[] arrayA = new int[100];
        double[] arrayB = new double[20];
        int[] arrayC = new int[]{3, 2, 4};
        int[] arrayD = {2, 3, 4, 6, 7, 8, 9, 9, 4, 6, 7, 32, 4325, 23};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayC[i]);
        }
        int[] arrayG;
        arrayG=new int []{2,2,2,3,5};
        System.out.println("===========");
        System.out.println(arrayG[3]);
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
    }
    }
