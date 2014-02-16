package c5_flowControl;

public class Switch {

    public static void main(String[] args) {
        final int a = 1;
        final int b;
        b = 2;
        int x = 0;
        switch (x) {
            case a: // ok
            //case b: // compiler error
        }
    }
}
