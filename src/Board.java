public class Board {
    private char [][] gBoard ;

    public Board(){
        gBoard = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    }

    public boolean play(char toSet, int x, int y){
        if (gBoard[x][y]==' '){
            //is still blank, so play is acceptable
            if (toSet=='X'||toSet=='x'){
                gBoard[x][y]='X';
            }
            else
                gBoard[x][y]='O';
            return true; //play was valid
        }
        return false;//if not blank, then I will ignore the 'play'
    }
    public void printBoard(){
//        System.out.println("-------");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(gBoard[i][j]);
                if (j<2){
                    System.out.print('|');
                } else System.out.println("");//print CRLF after each row
            }
//            System.out.println("|");
        }
//        System.out.println("-------");

    }

    public boolean checkWinner() {
        if (gBoard[0][0]!=' '&&Character.compare(gBoard[0][0],gBoard[0][1])==0 && Character.compare(gBoard[0][0],gBoard[0][2])==0) {return true;}//top row
        if (gBoard[1][0]!=' '&&Character.compare(gBoard[1][0],gBoard[1][1])==0 && Character.compare(gBoard[1][0],gBoard[1][2])==0) {return true;}//middle row
        if (gBoard[2][0]!=' '&&Character.compare(gBoard[2][0],gBoard[2][1])==0 && Character.compare(gBoard[2][0],gBoard[2][2])==0) {return true;}//bottom row
        if (gBoard[0][0]!=' '&&Character.compare(gBoard[0][0],gBoard[1][0])==0 && Character.compare(gBoard[0][0],gBoard[2][0])==0) {return true;}//first col
        if (gBoard[0][1]!=' '&&Character.compare(gBoard[0][1],gBoard[1][1])==0 && Character.compare(gBoard[0][1],gBoard[2][1])==0) {return true;}//second col
        if (gBoard[0][2]!=' '&&Character.compare(gBoard[0][2],gBoard[1][2])==0 && Character.compare(gBoard[0][2],gBoard[2][2])==0) {return true;}//third col
        if (gBoard[0][0]!=' '&&Character.compare(gBoard[0][0],gBoard[1][1])==0 && Character.compare(gBoard[0][0],gBoard[2][2])==0) {return true;}//diag TopLeft to BottomRight
        if (gBoard[0][2]!=' '&&Character.compare(gBoard[0][2],gBoard[1][1])==0 && Character.compare(gBoard[0][2],gBoard[2][0])==0) {return true;}//diag TopRight to BottomLeft
        return false; //nothing else won, so return NoWinner
    }

    public boolean isGameDone() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (gBoard[i][j]==' ') { return false;}
            }
        }
        return true;
    }
}
