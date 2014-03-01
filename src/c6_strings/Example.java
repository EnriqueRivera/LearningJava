

package c6_strings;

public class Example {
    public static void main(String[] args) {
        /*In this simple case, "abc" will go in the pool and s will refer to it.*/
        String s = "abc";   // creates one String object and one
                            // reference variable

        /*In this case, because we used the new keyword, Java will create a new String object
        in normal (nonpool) memory, and s will refer to it. In addition, the literal "abc" will
        be placed in the pool.*/
        String s2 = new String("abc");  // creates two objects,
                                        // and one reference variable       

    }
}
