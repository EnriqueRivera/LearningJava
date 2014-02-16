

package c3_assignments.wrapperClasses;

public class Wrapper {
    public static void main(String[] args) {
        //Wrapper's Constructors
        Integer i1 = new Integer(42);
        Integer i2 = new Integer("42");

        Float f1 = new Float(3.14f);
        Float f2 = new Float("3.14f");

        Character c1 = new Character('c');

        Boolean b = new Boolean("false");
        if (b){} // won't compile, using Java 1.4 or earlier
        
        //The valueOf() Methods
        Integer i3 = Integer.valueOf("101011", 2);  // converts 101011
                                                    // to 43 and
                                                    // assigns the value
                                                    // 43 to the
                                                    // Integer object i2
        
        Float f3 = Float.valueOf("3.14f");  // assigns 3.14 to the
                                            // Float object f2
        
        //xxxValue()
        Integer i4 = new Integer(42); // make a new wrapper object
        byte b2 = i4.byteValue();   // convert i2's value to a byte
                                    // primitive
        short s = i4.shortValue();  // another of Integer's xxxValue
                                    // methods
        double d = i4.doubleValue();    // yet another of Integer's
                                        // xxxValue methods
        
        Float f4 = new Float(3.14f); // make a new wrapper object
        short s2 = f4.shortValue(); // convert f2's value to a short
                                    // primitive
        
        //parseXxx() and valueOf()
        /*
            ¡ parseXxx() returns the named primitive.
            ¡ valueOf() returns a newly created wrapped object of the type that invoked
            the method.
        */
        double d4 = Double.parseDouble("3.14"); // convert a String
                                                // to a primitive
        Double d5 = Double.valueOf("3.14");     // create a Double obj
        long L2 = Long.parseLong("101010", 2);  // binary String to a
                                                // primitive
        Long L3 = Long.valueOf("101010", 2);    // binary String to
                                                // Long object
        
        
        //toString()
        Double d2 = new Double("3.14");
        System.out.println("d = " + d2.toString() ); // result is d2 = 3.14
        String ds = Double.toString(3.14); // ds = "3.14"
        //Integer and Long provide a third toString() method.
        String sl = "hex = "+ Long.toString(254,16); // sl = "hex = fe"
        
        
        //toXxxString() (Binary, Hexadecimal, Octal)
        String s3 = Integer.toHexString(254); // convert 254 to hex
        System.out.println("254 is " + s3); // result: "254 is fe"
        String s4 = Long.toOctalString(254); // convert 254 to octal
        System.out.print("254(oct) ="+ s4); // result: "254(oct) =376"
    }
}
