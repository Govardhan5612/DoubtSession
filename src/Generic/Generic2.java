package Generic;

public class Generic2 <T,R>{
    T instanceVar1;
    R instanceVar2;
    void method(T var1,R var2){
        System.out.println("Non static method  variable1 - "+var1+" variable2 - "+var2);
    }


    public static void main(String[] args) {

        Generic2<Integer,Float> obj2 = new Generic2<>();
        obj2.method(obj2.instanceVar1, obj2.instanceVar2);
        obj2.instanceVar1 = 20;
        obj2.instanceVar2 = 30.5F;
        obj2.method(obj2.instanceVar1, obj2.instanceVar2);


    }
}
