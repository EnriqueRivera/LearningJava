package c7_genericsAndCollections;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four"};
        List list = Arrays.asList(arr); // make a List
        
        System.out.println("size " + list.size());
        System.out.println("idx2 " + list.get(2));
        
        list.set(3, "six"); // change List
        arr[1] = "five"; // change array
        
        //list.add("");     //UnsupportedOperationException
        
        for (String s : arr) {
            System.out.print(s + " ");
        }
        
        System.out.println("");
        
        for (Object s : list) {
            System.out.print(s + " ");
        }
        
    }
}
