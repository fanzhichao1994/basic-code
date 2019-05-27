package cn.kye.fanzhichao.demo4;

public class Student {
    private String name;//姓名
    private int age;//名字
    private boolean male;//性别

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale (){
        return male;
    }
}
