package com.doubtsession;

public class ArrayEvenOdd {
    public static void main(String [] args){
        int [] numbers = new int[]{1,2,22,4,5,6,7,8,9,10};
        int odd = 0;
        int even = 0;
        System.out.print("Even Numbers : ");
        for (int i = 0; i<numbers.length;i++){
            if(numbers[i]%2 ==0){
                System.out.print(+numbers[i]+" ");
            }

        }
        System.out.println(" ");
        System.out.print("Odd Numbers : ");
        for (int i = 0; i<numbers.length;i++){
            if(numbers[i]%2 !=0){
                System.out.print(+numbers[i]+" ");
            }

        }
    }
}
