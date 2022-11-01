package com.doubtsession;

public class MethodCalling {
    public static void main(String [] args){
        StaticAndNonstaticMethods.method();//static method
        StaticAndNonstaticMethods obj1 = new StaticAndNonstaticMethods();//non static method
        obj1.method2();

    }
}
