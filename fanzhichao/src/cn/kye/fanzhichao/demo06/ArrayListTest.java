package cn.kye.fanzhichao.demo06;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int ran =  r.nextInt(32)+1;

            list.add(ran);
        }
        System.out.println(list);
    }
}
