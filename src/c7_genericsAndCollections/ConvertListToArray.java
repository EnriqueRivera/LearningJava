package c7_genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

    public static void main(String[] args) {
        List<Integer> iL = new ArrayList<>();
        for (int x = 0; x < 3; x++) {
            iL.add(x);
        }
        Object[] oa = iL.toArray(); // create an Object array
        
        Integer[] ia = {};
        ia = iL.toArray(ia); // create an Integer array
        
        iL.set(0, 123);     //the array and list aren't linked
        
        for (Object o : oa) {
            System.out.print(o + " ");
        }
        
        System.out.println("");
        
        for (Integer o : ia) {
            System.out.print(o + " ");
        }
        
        System.out.println("-----------------------");
        
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
    }
}
