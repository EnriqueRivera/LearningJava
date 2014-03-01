
package c6_fileNavigationAndIO;

import java.io.*;

class Writer1 {

    public static void main(String[] args) {
        try { // warning: exceptions possible
            boolean newFile = false;
            File file = new File("fileWrite1.txt");     // it's only an object
                    
            System.out.println(file.exists());          // look for a real file
            newFile = file.createNewFile();             // maybe create a file!
            System.out.println(newFile);                // already there?
            System.out.println(file.exists());          // look again
            
        } catch (IOException e) {
        }
    }
}
