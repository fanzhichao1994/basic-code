package cn.kye.fanzhichao.demo06;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> biglist = new ArrayList();
    Random r = new Random();

    public void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            biglist.add(num);

        }
        ArrayList<Integer> small=getList(biglist);
    }


    //对集合内是偶数的进行筛选，存入新集合
    public ArrayList<Integer> getList(ArrayList<Integer> smalllist) {
        for (int i = 0; i < 20; i++) {
            int m = list.get(i);
            if (m % 2 == 0) {
                smalllist.add(m);
            } else {
                System.out.println("这个数不是我要的");
            }
        }
        return smalllist;
    }
}
