package oops;

public class AbstractClassExtra extends AbstractClass {


    public int addition(int a, int b) {
        return (a+b);
    }


    public int subtraction(int a, int b) {
        return (a-b);
    }

    @Override
    public int division(int a, int b) {
        return (a/b);
    }


}
