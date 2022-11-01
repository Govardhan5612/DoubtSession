package oops;

public class Student3 {

    public String name;
    public int age;

    public Student3(){

    }

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    @Override
//    public String toString() {
//        return "Student3{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) {
        Student3 obj = new Student3();
        Student3 obj2 = new Student3("ram",20);

        System.out.println(obj);
        System.out.println(obj2.toString());

    }

}
