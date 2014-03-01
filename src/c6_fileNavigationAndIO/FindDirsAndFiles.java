package c6_fileNavigationAndIO;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindDirsAndFiles {

    public static void main(String[] args) {
        try {
            File newDir1 = new File("newDir");
            newDir1.mkdir();
            
            File newDir2 = new File(newDir1, "newDir2");
            newDir2.mkdir();
            File newDir3 = new File(newDir1, "newDir3");
            newDir3.mkdir();
            
            File newFile1 = new File(newDir2, "file1");
            newFile1.createNewFile();
            
            String[] files = newDir1.list();         // create the list
            for (String fn : files)                 // iterate through it
            {
                System.out.println("found: " + fn);
            }
            
            for (File fn : newDir1.listFiles())                 // iterate through it
            {
                if (fn.isFile()) {
                    System.out.println("File in newDir1: " + fn.getName());
                }
            }
            
            for (File fn : newDir2.listFiles())                 // iterate through it
            {
                if (fn.isFile()) {
                    System.out.println("File in newDir2: " + fn.getName());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FindDirsAndFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
