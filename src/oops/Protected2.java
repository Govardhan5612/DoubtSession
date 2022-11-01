package oops;

import com.doubtsession.Protected;

public class Protected2 extends Protected {

    public static void main(String[] args) {
        System.out.println(Protected.proctedStatic);
        Protected.method();
        Protected2 obj2 =new Protected2();
        obj2.mthhod1();
        System.out.println(obj2.protectInstance);


    }
}
