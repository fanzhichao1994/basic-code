package cn.kye.fanzhichao.demo08;

import java.util.Arrays;

public class ArraysT {
    public static void main(String[] args) {
        String str = "asjkdajlfasfaklsn,xn,n";

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        //正序遍历
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
            
        }
        System.out.println("===============");
        //倒叙遍历
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
            for (int j = charArray.length - 1; j >= 0; i--) {
                System.out.println(charArray[j]);
        }
    }
}}
