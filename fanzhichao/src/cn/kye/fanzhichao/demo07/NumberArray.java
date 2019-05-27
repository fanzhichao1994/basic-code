package cn.kye.fanzhichao.demo07;

public class NumberArray {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        String s = fromArrayTo(intArray);
        System.out.println(s);
    }

    public static String fromArrayTo(int[] ints) {
        String str = "{";
        for (int i = 0; i < 3; i++) {
            if (i == ints.length - 1) {
                str += "word" + ints[i] + "}";
            } else {
                str += "word" + ints[i] + "#";
            }
        }
        return str;
    }
}
