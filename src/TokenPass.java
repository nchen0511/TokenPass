public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass (int playerCount){
        this.board = new int[playerCount];
        for(int i=0;i<board.length;i++){
            this.board[i]=(int)(Math.random()*10)+1;
        }
        this.currentPlayer=(int)(Math.random()*playerCount);
    }

    public void distributeCurrentPlayerTokens(){
        int nxtPlayer = this.currentPlayer+1;
        int tokens = this.board[currentPlayer];
        this.board[currentPlayer] = 0;
        while(tokens!=0){
            if(nxtPlayer==nxtPlayer){
                nxtPlayer=0;
            }
            this.board[nxtPlayer]++;
            tokens--;
            nxtPlayer++;
        }
    }

    public void nextPlayer(){
        this.currentPlayer++;
        if(currentPlayer==board.length){
            currentPlayer=0;
        }
    }

    public int gameOver(){
        for(int i=0;i<board.length;i++){
            if(this.board[i]==0){
                return i;
            }
        }
        return -1;
    }

    public void printBoard(){
        String temp = "";
        for(int i=0;i<board.length;i++){
            temp+=" [ " + board[i] + " ] ";
        }
        System.out.println(temp);
    }
}
