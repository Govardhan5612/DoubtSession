package com.doubtsession;

public class OverLoadding {

    void method(){
        System.out.println("method no parameters passing");
    }
    void method(int x){
        System.out.println("method passing "+x+" parameter");
    }
    void method(int x, int y){
        System.out.println("method passing "+x+" , "+y+" parameters");
    }
    static void method(int x, int y,String z){
        System.out.println("method passing "+x+" , "+y+" , "+z+" parameters");
    }

    public static void main(String[] args) {
        OverLoadding obj = new OverLoadding();
        obj.method();
        obj.method(10);
        obj.method(10,12);
        method(10,12,"14");
    }
}
