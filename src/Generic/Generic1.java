package Generic;

public class Generic1 {
    <A> void method (A [] array){
        for (A x : array){
            System.out.print(x+" ");
        }
        System.out.println(" non static method");

    }
    static <E> void method2(E [] array){
        for (E x : array){
            System.out.print(x+" ");
        }
        System.out.println("static method");
    }

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5};
        Float [] floatArray = {1.2F,1.5F,1.2F,1.8F};
        Boolean [] booleanArray = {true,false,true,false};
        Generic1 obj = new Generic1();
        obj.method(intArray);
        obj.method(floatArray);
        obj.method(booleanArray);

        System.out.println("-----------");
        method2(intArray);
        method2(floatArray);
        method2(booleanArray);
    }
}
