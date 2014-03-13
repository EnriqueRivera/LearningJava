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
        
        Integer[] ia2 = {};
        ia2 = iL.toArray(ia2); // create an Integer array
        
        for (Object o : oa) {
            System.out.print(o + " ");
        }
        
        System.out.println("");
        
        for (Integer o : ia2) {
            System.out.print(o + " ");
        }
    }
}
