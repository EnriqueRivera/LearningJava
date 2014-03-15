package c8_innerClasses;

public class AnonymousInnerClasses {

}

//-------------------------------------------------------------------------
//Plain-Old Anonymous Inner Classes, Flavor One
class Popcorn {

    public void pop() {
        System.out.println("popcorn");
    }
}

class Food {

    Popcorn p = new Popcorn() {
        @Override
        public void pop() {
            System.out.println("anonymous popcorn");
        }

        public void sizzle() {
            System.out.println("anonymous sizzling popcorn");
        }
    };

    public void popIt() {
        p.pop(); // OK, Popcorn has a pop() method
        //p.sizzle(); // Not Legal! Popcorn does not have sizzle()
    }
}

//-------------------------------------------------------------------------
//Plain-Old Anonymous Inner Classes, Flavor Two
interface Cookable {

    public void cook();
}

class Food2 {
    Cookable c = new Cookable() {
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    };
}
