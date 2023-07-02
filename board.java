public class board {
    public static void main(String[] args) {
        char[][] board={
                 {'r','n','p','q','k','p','n','r'}
                ,{'a','b','c','d','e','f','g','h'}
                ,{'-','-','-','-','-','-','-','-'}
                ,{'-','-','-','-','-','-','-','-'}
                ,{'-','-','-','-','-','-','-','-'}
                ,{'-','-','-','-','-','-','-','-'}
                ,{'A','B','C','D','E','F','G','H'}
                ,{'R','N','P','Q','K','P','N','R'}
        };

    }
    public static boolean legalTurn(char[][] board , int x,int y,int z,int w,int turn){
        if(turn==1){
         if(board[x][y]>='A' && board[x][y]<='Z'){ //pawn
             for(int i=y;i<y+2;i++){
                 if(board[x][i]!='-')
                     return false;
             }

         }
        }
        return false;
    }

}
