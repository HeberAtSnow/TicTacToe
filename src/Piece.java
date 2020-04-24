import javax.swing.*;

public class Piece {
    private char marker;
    public Piece(char setTo){
        if (setTo == 'X' || setTo=='x'){
            this.marker = 'X';
        }
        else { this.marker='O'; }
    }

    public char getMarker(){
        return marker;
    }
}
