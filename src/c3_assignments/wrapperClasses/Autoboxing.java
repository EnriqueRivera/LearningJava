
package c3_assignments.wrapperClasses;


public class Autoboxing {
    public static void main(String[] args) {
        //pre–Java 5 days
        Integer y = new Integer(567);   // make it
        int x = y.intValue();           // unwrap it
        x++;                            // use it
        y = new Integer(x);             // re-wrap it
        System.out.println("y = " + y); // print it
        
        //Java 5
        Integer y2 = new Integer(567);      // make it
        y2++;                               // unwrap it, increment it,
                                            // rewrap it
        System.out.println("y = " + y2);    // print it
        
        //wrapper objects are immutable
        Integer y3 = 567;                   // make a wrapper
        Integer x3 = y3;                    // assign a second ref
                                            // var to THE wrapper
        System.out.println(y3 == x3);       // verify that they refer
                                            // to the same object
        y3++;                               // unwrap, use, "rewrap"
        System.out.println(x3 + " " + y3);  // print values
        System.out.println(y3 == x3);       // verify that they refer
                                            // to different objects
    }
}
