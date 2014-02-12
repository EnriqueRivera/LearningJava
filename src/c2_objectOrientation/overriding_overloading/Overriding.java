package c2_objectOrientation.overriding_overloading;

/*
    The rules for overriding a method are as follows:
    ■ The argument list must exactly match that of the overridden method. If they
    don't match, you can end up with an overloaded method you didn't intend.
    ■ The return type must be the same as, or a subtype of, the return type declared
    in the original overridden method in the superclass.
    ■ The access level can't be more restrictive than the overridden method's.
    ■ The access level CAN be less restrictive than that of the overridden method.
    ■ Instance methods can be overridden only if they are inherited by the subclass.
    A subclass within the same package as the instance's superclass can override
    any superclass method that is not marked private or final. A subclass in a
    different package can override only those non-final methods marked public
    or protected (since protected methods are inherited by the subclass).
    ■ The overriding method CAN throw any unchecked (runtime) exception,
    regardless of whether the overridden method declares the exception.
    ■ The overriding method must NOT throw checked exceptions that are new
    or broader than those declared by the overridden method. For example, a
    method that declares a FileNotFoundException cannot be overridden by a
    method that declares a SQLException, Exception, or any other non-runtime
    exception unless it's a subclass of FileNotFoundException.
    ■ The overriding method can throw narrower or fewer exceptions. Just because
    an overridden method "takes risks" doesn't mean that the overriding subclass'
    exception takes the same risks. Bottom line: an overriding method doesn't
    have to declare any exceptions that it will never throw, regardless of what the
    overridden method declares.
    ■ You cannot override a method marked final.
    ■ You cannot override a method marked static.
    ■ If a method can't be inherited, you cannot override it. Remember that
    overriding implies that you're reimplementing a method you inherited! For
    example, the following code is not legal, and even if you added an eat()
    method to Horse, it wouldn't be an override of Animal's eat() method.
 */

class TestAnimals {

    public static void main(String[] args) {
        Horse h = new Horse();
        //h.eat(); // Not legal because Horse didn't inherit eat()
    }
}

class Animal {

    private void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
}

class Horse extends Animal {
    
}

public class Overriding {

}
