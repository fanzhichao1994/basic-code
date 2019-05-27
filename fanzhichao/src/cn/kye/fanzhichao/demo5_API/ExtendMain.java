package cn.kye.fanzhichao.demo5_API;

public class ExtendMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
       // teacher.method();
        Assistant assistant = new Assistant();
       // assistant.method();
        System.out.println("========zzzzzzz");
        System.out.println(assistant.num);
        System.out.println(assistant.mm);
        System.out.println("========method");
        int max = assistant.method(20,15);
        System.out.println("max:"+max);
        System.out.println("========random");
        System.out.println(assistant.random(5));




    }


}
