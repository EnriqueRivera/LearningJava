package c6_serialization;

import java.io.*;

class Cat implements Serializable {} // 1

public class SerializeCat {

    public static void main(String[] args) {
        Cat c = new Cat(); // 2
        try {
            FileOutputStream fs = new FileOutputStream("testSer.ser");
            try (ObjectOutputStream os = new ObjectOutputStream(fs)) {
                os.writeObject(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer.ser");
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {  //try-with-resources
                c = (Cat) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
