
package desingPattern.singleton;

public class Only {

    private static final Only INSTANCE;
    
    static {
        INSTANCE = new Only();
    }

    private Only() {
        
    }

    public static final Only getInstace() {
        return INSTANCE;
    }
}