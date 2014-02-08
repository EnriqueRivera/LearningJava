
package DeclarationAndAccessControl_1;

/*
    A constructor can't have a return type.

    They can take arguments (including var-args).

    They must have the same name as the class in which they are declared.

    Constructors can't be marked static (they are after all associated with 
        object instantiation), they can't be marked final or abstract 
        (because they can't be overridden).
*/

public class Constructors {
    // legal constructors
    Constructors() { }
    private Constructors(byte b) { }
    Constructors(int x) { }
    Constructors(int x, int... y) { }
    
    // illegal constructors
    /*
    void Constructors() { }             // it's a method, not a constructor
    Foo() { }                           // not a method or a constructor
    Constructors(short s);              // looks like an abstract method
    static Constructors(float f) { }    // can't be static
    final Constructors(long x) { }      // can't be final
    abstract Constructors(char c) { }   // can't be abstract
    Constructors(int... x, int t) { }   // bad var-arg syntax
    */
}
