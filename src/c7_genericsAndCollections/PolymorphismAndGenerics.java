
package c7_genericsAndCollections;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class PolymorphismAndGenerics {
    public static void main(String[] args) {
        //List<Object> myList = new ArrayList<JButton>(); // NO!
        //List<Number> numbers = new ArrayList<Integer>(); // NO!
        // remember that Integer is a subtype of Number
        
        List<JButton> myList = new ArrayList<JButton>(); // yes
        List<Object> myList2 = new ArrayList<Object>(); // yes
        List<Integer> myList3 = new ArrayList<Integer>(); // yes
        
        Animal[] myArray = new Fish[3]; // yes
        
        //----------------------------------------------------
        
        Elephant[] arrEle = {new Elephant()};
        addAnimals(arrEle);
        
        //----------------------------------------------------
        
        ArrayList<Animal> listAnimal = new ArrayList<Animal>(){{
            new Animal(); 
            new Elephant(); 
            new Fish();
        }};
        
        usingExetends(listAnimal);
        usingSuper(listAnimal);
        
        //----------------------------------------------------
        
        List<?> list = new ArrayList<Elephant>();
        List<? extends Animal> aList = new ArrayList<Fish>();
        //List<?> foo = new ArrayList<? extends Animal>();              //Compilation fails!
        //List<? extends Elephant> cList = new ArrayList<Integer>();    //Compilation fails!
        List<? super BabyElephant> bList = new ArrayList<Animal>();
        //List<? super Elephant> dList = new ArrayList<BabyElephant>(); //Compilation fails!
        
    }
    
    static void usingExetends(ArrayList<? extends Animal> listAnimal) {
        //listAnimal.add(new Animal());    //Compilation error, you can't use 
                                           //the add method when you use "extends"
    }
    
    static void usingSuper(ArrayList<? super Elephant> listElephant) {
        //You can use the add method when you use "super", but only for adding 
        //objects that pass it IS-A test with "Elephant"
        listElephant.add(new Elephant());           
        listElephant.add(new BabyElephant());       //Sub type of Elephant
    }
    
    //That means any type of List can be assigned to the argument.
    //This argument is identical to "List<? extends Object>"
    void foo(List<?> list) { 
        //list.add(new Object());         //Compilation error, you can't use 
                                          //the add method when you use "<?>"
    }            
                                           
    //void foo(List<Object> list) { }       //List<Object> means that the method 
                                            //can take ONLY a List<Object>.
    
    static void addAnimals(Animal[] arrAn){
        //arrAn[0] = new Fish();      //ArrayStoreException
    }
}

class Animal { }
class Elephant extends Animal { }
class BabyElephant extends Elephant{}
class Fish extends Animal { }
class BabyFish extends Fish{}