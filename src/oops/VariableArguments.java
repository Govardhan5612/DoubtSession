package oops;

public class VariableArguments {

    public static void method(int ...variable ){
        for (int x :variable){

            System.out.print(x+"......");
        }
        System.out.println("method");

    }

    public static void main(String[] args) {
        VariableArguments.method(1);
        VariableArguments.method(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
        VariableArguments.method(1,4,5,8);
    }
}
