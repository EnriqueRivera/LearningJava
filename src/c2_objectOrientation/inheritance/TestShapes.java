package c2_objectOrientation.Inheritance;

class GameShape {

    public void displayShape() {
        System.out.println("displaying shape");
    }
    
    // more code
}

/*
    The PlayingPiece class inherits the generic display() method
    from the less-specialized class GameShape, and also adds its own method,
    movePiece().
*/
class PlayerPiece extends GameShape {

    public void movePiece() {
        System.out.println("moving game piece");
    }
    
    // more code
}

public class TestShapes {

    public static void main(String[] args) {
        PlayerPiece shape = new PlayerPiece();
        shape.displayShape();
        shape.movePiece();
    }
}