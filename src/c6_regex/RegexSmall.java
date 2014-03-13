package c6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
\d A digit
\s A whitespace character
\w A word character (letters, digits, or "_" (underscore))
[abc] Searches only for a's, b's or c's
[a-f] Searches only for a, b, c, d, e, or f characters
[a-fA-F] Searches for the first six letters of the alphabet, both cases.
0[xX][0-9a-fA-F] Hexadecimal literals
+ One or mor occurrences
* Zero or more occurrences
? Zero or one occurrence
[^abc] if you want to find anything but a's, b's, or c's in a file
"." (dot) any character can serve here

is greedy, ?? is reluctant, for zero or once
* is greedy, *? is reluctant, for zero or more
+ is greedy, +? is reluctant, for one or more
*/

public class RegexSmall {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab"); // the expression
        Matcher m = p.matcher("abaaaba"); // the source
        while (m.find()) {
            System.out.print(m.start() + " ");
        }
        
        System.out.println("");
        String s = "proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java";
        p = Pattern.compile("proj1([^,])*");
        m = p.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
        while (m.find()) {            
            System.out.print(s.substring(m.start(), m.end()) + " ");
        }
        
        System.out.println("");
        s = "yyxxxyxx";
        //p = Pattern.compile(".*xx"); //* is greedy 
        p = Pattern.compile(".*?xx"); //* is reluctant
        m = p.matcher("yyxxxyxx");
        while (m.find()) {            
            System.out.print(s.substring(m.start(), m.end()) + " ");
        }
    }
}
