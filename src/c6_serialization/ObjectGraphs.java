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

public class ObjectGraphs {
    public static void main(String[] args) {
        Collar c = new Collar(3);
        Dog d = new Dog(c, 20);
        
        try {
            FileOutputStream fo = new FileOutputStream("dog.save");
            try(ObjectOutputStream oos = new ObjectOutputStream(fo)) {
                oos.writeObject(d);
            } catch (IOException ex) {
                Logger.getLogger(ObjectGraphs.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            FileInputStream fi = new FileInputStream("dog.save");
            try(ObjectInputStream ois = new ObjectInputStream(fi)) {
                System.out.println(((Dog)ois.readObject()).getCollar().getCollarSize());
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(ObjectGraphs.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ObjectGraphs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Dog implements Serializable {

    private transient Collar theCollar;
    private final int dogSize;

    public Dog(Collar collar, int size) {
        theCollar = collar;
        dogSize = size;
    }

    public Collar getCollar() {
        return theCollar;
    }
    
    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeInt(theCollar.getCollarSize());
        } catch (IOException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void readObject(ObjectInputStream oi) {
        try {
            oi.defaultReadObject();
            theCollar = new Collar(oi.readInt());
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Collar {

    private final int collarSize;

    public Collar(int size) {
        collarSize = size;
    }

    public int getCollarSize() {
        return collarSize;
    }
}
