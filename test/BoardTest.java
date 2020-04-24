import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BoardTest {
    Board b;

    @BeforeEach
    void setUp() {
        b=new Board();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void isGameDone(){
        b.play('o',0,0);
        b.play('o',0,1);
        b.play('0',0,2);
        Assertions.assertEquals(false, b.isGameDone(),"should NOT be done yet, only 3 moves have been made");
        b.play('x',1,0);
        b.play('x',1,1);
        b.play('x',1,2);
        b.play('o',2,0);
        b.play('o',2,1);
        b.play('o',2,2);
        Assertions.assertEquals(true,b.isGameDone(),"With all 9 places covered, this should be done");

    }

    @Test
    void isThereAWinnerTopRow(){
        b.play('o',0,0);
        b.play('o',0,1);
        b.play('0',0,2);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on top row, Winner!");
    }
    @Test
    void isThereAWinnerMiddleRow(){
        b.play('o',1,0);
        b.play('o',1,1);
        b.play('0',1,2);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on Middle row, Winner!");
    }
    @Test
    void isThereAWinnerBottomRow(){
        b.play('o',2,0);
        b.play('o',2,1);
        b.play('0',2,2);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on Bottom row, Winner!");
    }
    @Test
    void isThereAWinnerCol1(){
        b.play('o',0,0);
        b.play('o',1,0);
        b.play('0',2,0);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on col1, Winner!");
    }
    @Test
    void isThereAWinnerCol2(){
        b.play('o',0,1);
        b.play('o',1,1);
        b.play('0',2,1);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on Col2, Winner!");
    }
    @Test
    void isThereAWinnerCol3(){
        b.play('o',0,2);
        b.play('o',1,2);
        b.play('0',2,2);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on col3, Winner!");
    }
    @Test
    void isThereAWinnerDiag1(){
        b.play('o',0,0);
        b.play('o',1,1);
        b.play('0',2,2);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on Diag TL-BR, Winner!");
    }
    @Test
    void isThereAWinnerDiag2(){
        b.play('o',0,2);
        b.play('o',1,1);
        b.play('0',2,0);
        Assertions.assertEquals(true,b.checkWinner(),"all 0s on Diag TR-BL, Winner!");
    }

    @Test
    void oTopRow(){
        b.play('o',0,0);
        b.play('o',0,1);
        b.play('0',0,2);
        b.printBoard();
        Assertions.assertTrue(true);//forced, screen oly
    }

    @Test
    void xTopRow(){
        b.play('X',0,0);
        b.play('X',0,1);
        b.play('X',0,2);
        b.printBoard();
        Assertions.assertTrue(true);//forced, for screen display only
    }
    @Test
    void printBoard() {
        b.printBoard();
        Assertions.assertTrue(true);//forced, for screen display only
        //screen display only
    }
}