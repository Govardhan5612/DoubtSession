package oops;

import com.doubtsession.OverLoadding;

public class OverLoading {

    static void method(int a,int b){
        System.out.println("in this method a and b integer values");
    }
     void method(int a,int b,int c){
        System.out.println("in this method a, b and c integer values");
    }
     void method(String name){
        System.out.println("in this method string values");
    }
     void method(int a,float b){
        System.out.println("in this method int and float values");
    }


    public static void main(String[] args) {
        OverLoading obj = new OverLoading();

        method(10,12);

        obj.method("name");
        obj.method(10,12,14);
        obj.method(10,12);
        obj.method(10,10.2f);


    }
}
