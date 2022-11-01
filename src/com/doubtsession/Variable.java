package com.doubtsession;

public class Variable {
    static int number = 14;//Static variable
    public int rank = 2;//Instance Variable
    public static void main(String [] args){
        int count =0;//local Variable
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {

                count++;
                break;
            }
        }
        if (count == 0) {
                System.out.println("It is Prime Number");

            } else  {
            System.out.println("It is not Prime Number");
        }

        Variable s = new Variable();
        System.out.println(s.rank);



    }
}
