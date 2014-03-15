package c8_innerClasses;

/*
 the following modifiers can be applied to an inner class:
 ■ final
 ■ abstract
 ■ public
 ■ private
 ■ protected
 ■ static—but static turns it into a static nested class not an inner class
 ■ strictfp

the following modifiers can be applied to a method-local inner class:
■ final
■ abstract

 ■ From inside the outer class instance code, use the inner class name in the
 normal way:
 MyInner mi = new MyInner();

 ■ From outside the outer class instance code (including static method code
 within the outer class), the inner class name must now include the outer
 class's name:
 MyOuter.MyInner
 To instantiate it, you must use a reference to the outer class:
 new MyOuter().new MyInner(); or outerObjRef.new MyInner();
 if you already have an instance of the outer class.
 */
public class InnerClassesAndMethodLocalInnerClasses {

    public static void main(String[] args) {
        new MyOuter().makeInner();

        MyOuter mo = new MyOuter();
        MyOuter.MyInner myInner = mo.new MyInner();     //Creating an Inner Class Object from 
                                                        //Outside the Outer Class Instance Code
        myInner.seeOuter();
    }
}

class MyOuter {

    private int x = 7;

    public void makeInner() {
        MyInner in = new MyInner();     //Instantiating an Inner Class from 
                                        //Within the Outer Class
        in.seeOuter();
    }

    class MyInner {

        public void seeOuter() {
            System.out.println("Outer x is " + x);

            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + MyOuter.this);
        }
    }
}

//----------------------------------------------------------------------
class MyOuter2 {

    private String x = "Outer2";

    void doStuff() {
        int var;        //The method-local inner class CAN NOT use local variables
        final int var2 = 1;     //The method-local inner class CAN use local varibales marked as final
        
        class MyInner {
            
            public void seeOuter() {
                System.out.println("Outer x is " + x);
                //System.out.println("var = " + var);     //won't compile!
                System.out.println("var2 = " + var2);
                
            } // close inner class method
        } // close inner class definition
        MyInner mi = new MyInner(); // This line must come
                                    // after the class
        mi.seeOuter();
    } // close outer class method doStuff()
} // close outer class
