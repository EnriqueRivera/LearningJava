package c1_declarationAndAccessControl;

public class AccessModifiers {
    /*
        ! Default Access: package-level access.
        ! Public Access: A class declaration with the public keyword gives all classes
            from all packages access to the public class.
        ! Private Access: Members marked private can't be accessed by code in any 
            class other than the class in which the private member was declared.
        ! Protected Access: The protected and default access control levels are almost 
            identical, but with one critical difference. A default member may be accessed 
            only if the class accessing the member belongs to the same package, whereas a 
            protected member can be accessed (through inheritance) by a subclass even if 
            the subclass is in a different package.
    */
}
