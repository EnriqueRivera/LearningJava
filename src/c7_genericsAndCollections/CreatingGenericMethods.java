package c7_genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class CreatingGenericMethods {

    public <T> void makeArrayList(T t) {    // take an object of an
                                            // unknown type and use a
                                            // "T" to represent the type
        
        List<T> list = new ArrayList<T>();  // now we can create the
                                            // list using "T"
        list.add(t);
    }
}
