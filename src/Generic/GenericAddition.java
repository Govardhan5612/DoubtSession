package Generic;

public class GenericAddition {
    <A,E> void intSum (A var1,E var2){
       int sum = (int)var1+(int)var2;
        System.out.println("Addition - "+sum);

    }
    <A,E> void floatSum (A var1,E var2){
        float sum = (float)var1+(float)var2;
        System.out.println("Addition - "+sum);

    } <A,E> void doubleSum (A var1,E var2){
        double sum = (double)var1+(double)var2;
        System.out.println("Addition - "+sum);

    }

    public static void main(String[] args) {
        GenericAddition obj = new GenericAddition();
        obj.intSum(10,10);
        obj.floatSum(10.5F,20.4F);
        obj.doubleSum(123.4D,100.0D);
    }
}
