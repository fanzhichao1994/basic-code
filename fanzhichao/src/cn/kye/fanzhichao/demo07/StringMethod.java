package cn.kye.fanzhichao.demo07;

public class StringMethod
{
    public static void main(String[] args) {
        int length = "ssssssssjalsjdlajklsjfklajklf".length();
        System.out.println(length);
        String str1 = "Hello";
        String str2 = "man";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("=============");

        char ch = str1.charAt(1);
        System.out.println("索引为1的字符"+ch);

        char[] num = str1.toCharArray();
        System.out.println(num[0]);
        System.out.println(num.length);

        byte[] bytes = str1.getBytes();
        System.out.println(bytes[0]);
        System.out.println(bytes[1]);
        System.out.println(bytes[2]);

        String mm = str2.replace("m", "*");
        System.out.println(mm);
    }
}
