package cn.kye.fanzhichao.demo4;

public class StudentService {
    public static void main(String[] args) {
        StudentStandard stu = new StudentStandard();
        stu.setAge(20);
        stu.setName("范志超");
        System.out.println("姓名："+stu.getName()+"年龄"+stu.getAge());
        System.out.println("===============");
        StudentStandard stu2 = new StudentStandard("殷晶晶",25);
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());

    }
}
