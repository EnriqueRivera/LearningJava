package c2_objectOrientation.polymorphism;

/*
 A PlayerPiece can be treated polymorphically as one of four things at any 
 given time, depending on the declared type of the reference variable:
 ¡ An Object (since any object inherits from Object)
 ¡ A GameShape (since PlayerPiece extends GameShape)
 ¡ A PlayerPiece (since that's what it really is)
 ¡ An Animatable (since PlayerPiece implements Animatable)
 */
public class PlayerPiece extends GameShape implements Animatable {

    public void movePiece() {
        System.out.println("moving game piece");
    }

    public void animate() {
        System.out.println("animating...");
    }

    public static void main(String[] args) {
        //Legal declarations
        PlayerPiece player = new PlayerPiece();
        Object o = player;
        GameShape shape = player;
        Animatable mover = player;
    }
}

class GameShape {
}

interface Animatable {
}
