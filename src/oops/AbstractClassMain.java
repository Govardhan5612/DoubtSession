package oops;

public class AbstractClassMain  {
    public static void main(String[] args) {
        Operators operator = new AbstractClassExtra();

        System.out.println(operator.addition(10,5));
        System.out.println(operator.subtraction(10,5));
        System.out.println(operator.multiplication(4,4));
        System.out.println(operator.division(10,2));
    }


}

