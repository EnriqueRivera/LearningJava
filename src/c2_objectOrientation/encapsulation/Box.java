package c2_objectOrientation.Encapsulation;

public class Box {
    // protect the instance variable; only an instance of Box can access it
    private int size;
    
    // Provide public getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }
}
