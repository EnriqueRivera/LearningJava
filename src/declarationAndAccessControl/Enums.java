package declarationAndAccessControl;

/*
    The key points to remember about enum constructors are

    ■ You can NEVER invoke an enum constructor directly. The enum constructor
    is invoked automatically, with the arguments you define after the constant
    value. For example, BIG(8) invokes the CoffeeSize constructor that takes
    an int, passing the int literal 8 to the constructor. (Behind the scenes, of
    course, you can imagine that BIG is also passed to the constructor, but we
    don't have to know—or care—about the details.)
    ■ You can define more than one argument to the constructor, and you can
    overload the enum constructors, just as you can overload a normal class
    constructor. To initialize a CoffeeType with both the number of ounces and, 
    say, a lid type, you'd pass two arguments to the constructor as BIG(8, "A"), 
    which means you have a constructor in CoffeeSize that takes both an int and 
    a String.
 */
public class Enums {

    enum CoffeeSize {

        BIG(8),
        HUGE(10),
        OVERWHELMING(16) { // start a code block that defines the "body" for this constant
            @Override
            public String getLidCode() { // override the method defined in CoffeeSize
                return "A";
            }
        }; // the semicolon is REQUIRED when more code follows

        CoffeeSize(int ounces) {
            this.ounces = ounces;
        }
        
        private final int ounces;

        public int getOunces() {
            return ounces;
        }

        public String getLidCode() { // this method is overridden by the OVERWHELMING constant
            return "B"; // the default value we want to return for CoffeeSize constants
        }
    }

    public static void main(String[] args) {

    }
}

enum CoffeeSize { BIG, HUGE, OVERWHELMING } // this cannot be private or protected
