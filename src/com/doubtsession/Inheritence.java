package com.doubtsession;

class Animal{
    String colour;
    int age;
    void animalMethod1(){
        System.out.println("Anmals1");
    }
    void animalMethod2(){
        System.out.println("Animals2");
    }
}

class Lion extends Animal{
    int legs;
    String gender;

    void lionMethod1(){
        System.out.println("Lion");

    }
    void lionMethod2(){
        System.out.println("Lion is one of the Animal");
    }

}

public class Inheritence {
    public static void main(String[] args) {
        Animal obj = new Animal();
        System.out.println(obj.colour);
        System.out.println(obj.age);
        obj.animalMethod1();
        obj.animalMethod2();



        Lion obj1 = new Lion();
        obj1.lionMethod1();
        obj1.lionMethod2();
        System.out.println(obj1.legs);
        System.out.println(obj1.gender);

        System.out.println(obj1.colour);
        System.out.println(obj1.age);
        obj1.animalMethod1();
        obj1.animalMethod2();


    }

}
