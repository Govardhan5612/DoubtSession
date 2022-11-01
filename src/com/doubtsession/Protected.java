package com.doubtsession;

public class Protected {
    protected int protectInstance;
    protected static int proctedStatic;
    protected static void method(){
        System.out.println("protected static method");
    }
    protected void mthhod1(){
        System.out.println("Protected non static method");
    }

    public static void main(String[] args) {
        System.out.println(proctedStatic);
        method();

        Protected obj = new Protected();
        obj.mthhod1();
        System.out.println(obj.protectInstance);
    }
}
