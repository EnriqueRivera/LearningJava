package c7_genericsAndCollections;

import java.util.*;

public class RentalGeneric<T> {         // "T" is for the type
    // parameter

    private List<T> rentalPool;         // Use the class type for the
    // List type
    private int maxNum;

    public RentalGeneric(
            int maxNum, List<T> rentalPool) {   // constructor takes a
        // List of the class type
        this.maxNum = maxNum;
        this.rentalPool = rentalPool;
    }

    public T getRental() {                  // we rent out a T
        // blocks until there's something available
        return rentalPool.get(0);
    }

    public void returnRental(T returnedThing) { // and the renter
        // returns a T
        rentalPool.add(returnedThing);
    }
}

class TestRental {

    public static void main(String[] args) {
        //make some Cars for the pool
        Car c1 = new Car();
        Car c2 = new Car();
        List<Car> carList = new ArrayList<Car>();
        carList.add(c1);
        carList.add(c2);
        RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);
        // now get a car out, and it won't need a cast
        Car carToRent = carRental.getRental();
        carRental.returnRental(carToRent);
        // can we stick something else in the original carList?
        //carList.add(new Cat("Fluffy"));       //Compilation fails!
    }
}

class Car {
}

//---------------------------------------------------------------------
class UseTwo<T, X> {

    T one;
    X two;

    UseTwo(T one, X two) {
        this.one = one;
        this.two = two;
    }

    T getT() {
        return one;
    }

    X getX() {
        return two;
    }
    // test it by creating it with <String, Integer>

    public static void main(String[] args) {
        UseTwo<String, Integer> twos
                = new UseTwo<String, Integer>("foo", 42);
        String theT = twos.getT(); // returns a String
        int theX = twos.getX(); // returns Integer, unboxes to int
    }
}

//---------------------------------------------------------------------

class AnimalHolder<T extends Animal> {   // use "T" instead

    T animal;

    public static void main(String[] args) {
        AnimalHolder<Elephant> dogHolder = new AnimalHolder<Elephant>(); // OK
        //AnimalHolder<Integer> x = new AnimalHolder<Integer>(); // NO!
    }
}

//----------------------------------------------------------------------

//class NumberHolder<?> { ? aNum; } // NO!
class NumberHolder<T> { T aNum; } // Yes
