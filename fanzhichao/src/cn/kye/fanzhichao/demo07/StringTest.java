package cn.kye.fanzhichao.demo07;

public class StringTest
{
    public static void main(String[] args) {

        System.out.println("ssss");
        String str = new String();
        System.out.println("This is the first String"+str);
        char [] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println(str2);
        byte []str3 = {'A','B','C'};
        System.out.println("sss"+str3);
        String str4 = "Hello";
        System.out.println(str4);
    }
}
