
package declarationAndAccessControl;

/*
    Primitives: A primitive can be one of eight types: char, boolean, byte,
        short, int, long, double, or float. Once a primitive has been declared, its
        primitive type can never change, although in most cases its value can change.

    Reference variables: A reference variable is used to refer to (or access) an
        object. A reference variable is declared to be of a specific type and that type
        can never be changed. A reference variable can be used to refer to any object
        of the declared type, or of a subtype of the declared type (a compatible type).
*/

/*

    Instance Variables

    ■ Can use any of the four access levels (which means they can be marked with
        any of the three access modifiers)
    ■ Can be marked final
    ■ Can be marked transient
    ■ Can be marked volatile
    ■ Cannot be marked abstract
    ■ Cannot be marked synchronized
    ■ Cannot be marked strictfp
    ■ Cannot be marked native
    ■ Cannot be marked static, because then they'd become class variables.

*/

/*
    Transient Variables:
    If you mark an instance variable as transient, you're telling the JVM to skip
    (ignore) this variable when you attempt to serialize the object containing it.

    Volatile Variables:
    The volatile modifier tells the JVM that a thread accessing the variable must
    always reconcile its own private copy of the variable with the master copy in
    memory.

*/

public class Variables {
    static int var1;        //Class variable
    int var2;               //Instance variable
    
    //Primitives.   Bits        Minimum Range       Maximum Range
    byte by;        //8         //-2^7              //(2^7) - 1
    short s;        //16        //-2^15             //(2^15) - 1
    int i;          //32        //-2^31             //(2^31) - 1
    long l;         //64        //-2^63             //(2^63) - 1
    float f;        //32        
    double d;       //64        
    char c;
    boolean b;
    
    
    void method(int var4 /*Parameter*/) {
        int var3;           //Local variable
    }
}
