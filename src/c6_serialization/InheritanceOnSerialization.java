package c6_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InheritanceOnSerialization {
    public static void main(String[] args) {
        Doggy d = new Doggy("Fido", 20);
        try {
            FileOutputStream fos = new FileOutputStream("dog.ser");
            try(ObjectOutputStream os = new ObjectOutputStream(fos)) {
                os.writeObject(d);
            } catch (IOException ex) {
                Logger.getLogger(InheritanceOnSerialization.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InheritanceOnSerialization.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream fis = new FileInputStream("dog.ser");
            try(ObjectInputStream is = new ObjectInputStream(fis)) {
                System.out.println(((Doggy)is.readObject()).getAge());
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(InheritanceOnSerialization.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InheritanceOnSerialization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Doggy extends Animal implements Serializable {
    private final String name;

    public Doggy(String name, int age) {
        this.name = name;
        super.age = age;
    }

    public String getName() {
        return name;
    }
}

class Animal {
    protected int age = 10;

    public int getAge() {
        return age;
    }
}
