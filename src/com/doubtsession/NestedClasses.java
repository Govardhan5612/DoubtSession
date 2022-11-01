package com.doubtsession;

public class NestedClasses {
   public class Dog{
       static void method(){
           System.out.println(" inside Dog Class static method");
       }

       static void method1(){
           System.out.println(" inside Dog Class static method1");
       }
        void method2(){
           System.out.println("inside Dog Class non static method2");
       }

       void method3(){
           System.out.println("inside Dog Class non static method3");
       }

    }

    public class Cat{

        static void member(){
            System.out.println(" inside Cat Class static member");
        }

        static void member1(){
            System.out.println(" inside Cat Class static member1");
        }
        void member2(){
            System.out.println("inside Cat Class non static member2");
        }

        void member3(){
            System.out.println("inside Cat Class non static member3");
        }

    }

    public static void main(String[] args) {
        System.out.println("1");

        Dog.method();
        Dog.method1();
        NestedClasses clas = new NestedClasses();
        NestedClasses.Dog obj = clas.new Dog();
        obj.method2();
        obj.method3();

        Cat.member();
        Cat.member1();
        NestedClasses.Cat obj1 = clas.new Cat();
        obj1.member2();
        obj1.member3();


    }
}
