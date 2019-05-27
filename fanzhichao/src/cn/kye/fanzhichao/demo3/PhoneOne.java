package cn.kye.fanzhichao.demo3;

import cn.kye.fanzhichao.demo1.HelloWorld;

public class PhoneOne {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        Phone pho = new Phone();
        pho.call("fanzhichao");
        pho.color = "cooooo";
        System.out.println(pho.color);
        // hello.
        // System.out.println(fans);
        hello.swit(5);
        hello.son();
        hello.chengji();
        hello.fans = "fanzhichao";
        System.out.println(hello.fans);

    }
}
