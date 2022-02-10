import java.util.Scanner;

public class TikTakToo {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char[][] board ={{'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}};
        printBoard(board);
        for(int i=0; i<9; i++){
            if(i%2 == 0){
                System.out.println("Turn : X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] ='X';
            }else{
                System.out.println("Turn : O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] ='O';
            }
            printBoard(board);
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("\n");
        for(int i= 0; i<board.length; i++){
            for(int j=0; j<board[i].length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
    public static int[] askUser(char[][] board){
        System.out.print("pick the row and column: ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        while(board[row][column] != '_'){
            System.out.println("choose again");
             row = scan.nextInt();
             column = scan.nextInt();
        }

        return new int[] {row, column};
    }
}
