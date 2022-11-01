package oops;
class Student{
    int x = 10;
     void student(){
        System.out.println("Student class student method");
    }
}
class Employee extends Student {
    int y = 10;

    void employee() {
        System.out.println("Employee class employee method");
    }

    void student() {
        System.out.println("Employee class student method");

    }
}
class Person extends Employee{

     }

public class OverRidding {
    public static void main(String[] args) {


        Employee obj2 = new Employee();
        obj2.employee();
        obj2.student();


    }

}
