package com.doubtsession;

public class Protected1 {
    public static void main(String[] args) {
        System.out.println(Protected.proctedStatic);
        Protected.method();
        Protected obj =new Protected();
        obj.mthhod1();

        System.out.println(obj.protectInstance);
    }
}
