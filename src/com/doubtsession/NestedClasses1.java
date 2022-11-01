package com.doubtsession;

public class NestedClasses1 {
    public static void main(String[] args) {



        NestedClasses.Dog.method();
        NestedClasses.Dog.method1();
        NestedClasses clas = new NestedClasses();
        NestedClasses.Dog obj = clas.new Dog();
        obj.method2();
        obj.method3();

        NestedClasses.Cat.member();
        NestedClasses.Cat.member1();
        NestedClasses.Cat obj1 = clas.new Cat();
        obj1.member2();
        obj1.member3();

    }
}
