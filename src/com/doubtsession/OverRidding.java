package com.doubtsession;

class One{
    int a;
    void method(){
        System.out.println("class one method");
    }
}
class Two extends One{
    int b;
    void method2(){
        System.out.println("class two method2");
    }
    // Over Ridding
    void method(){
        System.out.println("class one over riding");
    }
}

public class OverRidding {
    public static void main(String[] args) {
        One obj = new One();
        obj.method();
        System.out.println(obj.a);

        Two obj1 = new Two();
        obj1.method2();
        obj1.method();
        System.out.println(obj1.a);
        System.out.println(obj1.b);

    }


}
