package com.doubtsession;

public class EqualsAndCompare {

    public static int method1(){
        int x = 10;
        int y = 12;
        int sumOfXAndY =x+y;
        return sumOfXAndY;
    }
    public static int method2(){
        int a = 10;
        int b = 12;
        int sumOfAAndB = a+b;
        return sumOfAAndB;

    }

    public static void main(String[] args) {

        Integer firstSum = method1();
        Integer secondSum = method2();

        System.out.println("First sum and Second sum "+firstSum.equals(secondSum)+" are equals");
        
        int compare = firstSum.compareTo(secondSum);
        if (compare == 0){
            System.out.println(" Two are equal");
        } else if (compare > 0) {
            System.out.println("First sum is grater");
            
        }
        else {
            System.out.println("Second sum is grater");
        }


    }
}
