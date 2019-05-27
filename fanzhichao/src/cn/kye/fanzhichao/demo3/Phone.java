package cn.kye.fanzhichao.demo3;

public class Phone {
    //属性（成员变量）：颜色、价格、品牌
    //行为（成员方法）：打电话、上网
    String color;
    String brand;
    double price;

    public void call(String who) {
        System.out.println("call:"+who);
    }

    public void sendMassage() {
        System.out.println("sendmassage");
    }
}
