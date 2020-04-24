import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board b = new Board();
        char nextTurn = 'X'; //who's turn is it to play next?
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        while(b.isGameDone()==false && b.checkWinner()==false){
            //I need a player to make a move
            b.printBoard();
            System.out.println("Player "+nextTurn+" enter x y:");
            x = sc.nextInt();
            y = sc.nextInt();
            if (x>=3 || x<0 || y<0 || y>=3) {
                System.out.println("Sorry, but the numbers entered must be between 0-1-2.  Try again.");
            }
            else if (b.play(nextTurn,x,y)==false) {
                System.out.println("Sorry, but Player_"+nextTurn+" can not play at ["+x+"]["+y+"] as it was already taken.  Try again.");
            }
            else {//advance next player to play next
                if (nextTurn=='X') {nextTurn='O';}
                else {nextTurn='X';}
            }
        }
        System.out.println("Final board is:");
        b.printBoard();
        if (b.checkWinner()==true) {
            System.out.println("CONGRATULATIONS WINNER!!!!!!");
        }
        else System.out.println("CATS Game.  No Winner.");
    }
}
