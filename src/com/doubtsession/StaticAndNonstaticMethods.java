package com.doubtsession;

public class StaticAndNonstaticMethods {
    public static void method(){
        System.out.println(" method - Static method");

    }
    public void method2(){
        System.out.println("method2 -  Non Static method");

    }
    public static void main(String [] args){
        method();//Static method
        StaticAndNonstaticMethods obj = new StaticAndNonstaticMethods();//non static method
        obj.method2();

    }

}
