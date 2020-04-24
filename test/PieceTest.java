import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PieceTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void makeX(){
        Piece p = new Piece('X');
        Assertions.assertEquals('X',p.getMarker(),"Should be X");
        Piece p2 = new Piece('x');
        Assertions.assertEquals('X',p2.getMarker(),"Should be X");
    }
    @Test
    void makeO(){
        Piece p = new Piece('O');
        Assertions.assertEquals('O',p.getMarker(),"Should be O");
    }





}