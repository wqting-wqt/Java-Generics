package 泛型类;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> as = new ArrayList<Student>();
        Student s1 = new Student("admin", "123456");
        Student s2 = new Student("guest", "123456");
        as.add(s1);
        as.add(s2);
        System.out.println("学生对象的数量： " + as.size());
        for (int i = 0; i < as.size(); i++) {
            Student c = as.get(i);
            System.out.println("账号：" + c.getAccount() + "\n密码： " + c.getPassword());
        }
    }
}
