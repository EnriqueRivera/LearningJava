package c6_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test implements Serializable{
    int a = 1;
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<>();
        Test t = new Test();
        t.a = 9;
        list.add(t);
        
        try {
            FileOutputStream fos = new FileOutputStream("a");
            try(ObjectOutputStream os = new ObjectOutputStream(fos)) {
                os.writeObject(list);
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileInputStream fis = new FileInputStream("a");
            try(ObjectInputStream is = new ObjectInputStream(fis)) {
                System.out.println(((ArrayList<Test>)is.readObject()).get(0).a);
            } catch (IOException|ClassNotFoundException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_WEEK, 30);
        cal.add(Calendar.MONTH, -1);
        System.out.println(cal.getTime());
    }
}
