
package c2_objectOrientation.overriding_overloading;

/*
    ■ Overloaded methods MUST change the argument list.
    ■ Overloaded methods CAN change the return type.
    ■ Overloaded methods CAN change the access modifier.
    ■ Overloaded methods CAN declare new or broader checked exceptions.
    ■ A method can be overloaded in the same class or in a subclass. In other words,
    if class A defines a doStuff(int i) method, the subclass B could define a
    doStuff(String s) method without overriding the superclass version that
    takes an int. So two methods with the same name but in different classes
    can still be considered overloaded, if the subclass inherits one version of the
    method and then declares another overloaded version in its class definition.
*/
public class Overloading {
}