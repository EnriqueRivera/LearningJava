package c5.flowControl;

public class Loops {

    public static void main(String[] args) {
        //Labeled Statements
        
        boolean isTrue = true;
        outer:
        for (int i = 0; i < 5; i++) {
            while (isTrue) {
                System.out.println("Hello");
                break outer;
            } // end of inner while loop
            System.out.println("Outer loop."); // Won't print
        } // end of outer for loop
        System.out.println("Good-Bye");
        
        //-----------------------------------------------------
        
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello");
                continue outer;
            } // end of inner loop
            System.out.println("outer"); // Never prints
        }
        System.out.println("Good-Bye");
    }
}
