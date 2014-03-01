
package c6_fileNavigationAndIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Writer3 {
    public static void main(String[] args) {
        try {
            File f = new File("Writer3.txt");
            PrintWriter pw = new PrintWriter(f);
            
            pw.println("Hola Mundo");
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String s;
            while ((s = br.readLine()) != null) {                
                System.out.println(s);
            }
            
            br.close();
            
            f.renameTo(new File("rename.txt"));
            
            f = new File("newDir");
            f.mkdir();
            
            new File(f, "newFile.txt").createNewFile();
            
            f.delete();                     //You can't delete a directory if it's not empty
        } catch (IOException ex) {
            Logger.getLogger(Writer3.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
