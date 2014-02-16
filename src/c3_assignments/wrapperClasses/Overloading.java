package c3_assignments.wrapperClasses;

import java.io.FileNotFoundException;

public class Overloading {

}

/*
Take a look at three factors that can make overloading a little tricky:
■ Widening
■ Autoboxing
■ Var-args

Here's a review of the rules for overloading methods using widening, boxing,
and var-args:
■ Primitive widening uses the "smallest" method argument possible.
■ Used individually, boxing and var-args are compatible with overloading.
■ You CANNOT widen from one wrapper type to another. (IS-A fails.)
■ You CANNOT widen and then box. (An int can't become a Long.)
■ You can box and then widen. (An int can become an Object, via Integer.)
■ You can combine var-args with either widening or boxing.
*/
class EasyOver {
    
    static void go(int x) {
        System.out.print("int ");
    }

    static void go(long x) {
        System.out.print("long ");
    }

    static void go(double x) {
        System.out.print("double ");
    }

    public static void main(String[] args) {
        byte b = 5;
        short s = 5;
        long l = 5;
        float f = 5.0f;
        go(b);
        go(s);
        go(l);
        go(f);
    }
}
