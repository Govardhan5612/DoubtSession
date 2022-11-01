package oops;

class Parent2{
    private void method1(){
        System.out.println("parent class private method1");
    }
    static void method2(){
        System.out.println("parent class static method");
    }
    void method3(){
        System.out.println("parent class non static method3");
    }

}
class Child2 extends Parent2{

    private void method1(){
        System.out.println("child class private method1");
    }

    static void method2(){

        System.out.println("child class static method");
    }

    void method3(){

        System.out.println("child class non static method3");
    }


}
public class MethodHiding {

    public static void main(String[] args) {


        Parent2 obj = new Parent2();
        Child2 child2 = new Child2();

        Parent2 parent = new Child2();

        obj.method3();//non static
        Parent2.method2();//static

        System.out.println("---------");

        parent.method3();//inherited not over ridden

        System.out.println("---------");

        child2.method3();
        Child2.method2();
    }
}
