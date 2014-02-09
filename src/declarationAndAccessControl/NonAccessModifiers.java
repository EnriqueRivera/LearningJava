
package declarationAndAccessControl;

public class NonAccessModifiers {
    /*
        ! strictfp: Marking a class as strictfp means that any method code in the class will
            conform to the IEEE 754 standard rules for floating points. If
            you don't declare a class as strictfp, you can still get strictfp behavior on a
            method-by-method basis, by declaring a method as strictfp.
        ! Synchronized Methods: The synchronized keyword indicates that a method can be 
            accessed by only one thread at a time.
        ! Native Methods: indicates that a method is implemented in platform-dependent
            code, often in C. Note that a native method's body must be a semicolon (;) 
            (like abstract methods), indicating that the implementation is omitted.
        ! Final Classes: When used in a class declaration, the final keyword means
            the class can't be subclassed.
        ! Final Methods: The final keyword prevents a method from being overridden 
            in a subclass, and is often used to enforce the API functionality of a method.
        ! Final Arguments: It can't be modified within the method.
        ! Abstract Classes.
    */
    
    /*
        Things you can mark as static:
        ■ Methods
        ■ Variables
        ■ A class nested within another class, but not within a method
        ■ Initialization blocks
    
        Things you can't mark as static:
        ■ Constructors (makes no sense; a constructor is used only to create instances)
        ■ Classes (unless they are nested)
        ■ Interfaces
        ■ Method local inner classes
        ■ Inner class methods and instance variables
        ■ Local variables
    */
}

