

package c3_assignments.wrapperClasses;

/*
Yikes! The equals() method seems to be working, but what happened with ==
and != ? Why is != telling us that i1 and i2 are different objects, when == is saying
that i3 and i4 are the same object? In order to save memory, two instances of the
following wrapper objects (created through boxing), will always be == when their
primitive values are the same:
¡ Boolean
¡ Byte
¡ Character from \u0000 to \u007f (7f is 127 in decimal)
¡ Short and Integer from -128 to 127
Note: When == is used to compare a primitive to a wrapper, the wrapper will be
unwrapped and the comparison will be primitive to primitive.
*/

public class Boxing {
    public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        if(i1 != i2) System.out.println("different objects");
        if(i1.equals(i2)) System.out.println("meaningfully equal");
        
        Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");
    }
}
