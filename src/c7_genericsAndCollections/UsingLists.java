package c7_genericsAndCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingLists {

    public static void main(String[] args) {
        List<Doggy> d = new ArrayList<Doggy>();
        Doggy dog = new Doggy("aiko");
        d.add(dog);
        d.add(new Doggy("clover"));
        d.add(new Doggy("magnolia"));
        Iterator<Doggy> i3 = d.iterator(); // make an iterator
        while (i3.hasNext()) {
            Doggy d2 = i3.next(); // cast not required
            System.out.println(d2.name);
        }
        System.out.println("size " + d.size());
        System.out.println("get1 " + d.get(1).name);
        System.out.println("aiko " + d.indexOf(dog));
        d.remove(2);
        Object[] oa = d.toArray();
        for (Object o : oa) {
            Doggy d2 = (Doggy) o;
            System.out.println("oa " + d2.name);
        }
    }
}

class Doggy {

    public String name;

    Doggy(String n) {
        name = n;
    }
}
