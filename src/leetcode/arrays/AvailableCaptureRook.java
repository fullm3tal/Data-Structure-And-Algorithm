package leetcode.arrays;

public class AvailableCaptureRook {

    
    
    public static void main(String[] args) {

        char[][] board = new char[][]{ 
                {'.','.','.','.','.','.','.','.'},
                {'.','.','B','B','B','B','B','.'},
                {'.','p','B','p','p','p','B','p'},
                {'.','p','B','p','R','p','B','p'},
                {'.','p','B','p','p','p','B','p'},
                {'.','.','B','B','B','B','B','.'},
                {'.','.','.','p','p','p','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        
        
//        char[][] board = new char[][]{
//                {'.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
//                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
//                {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
//                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
//                {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.'},
//                {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board));
    }

    public static int numRookCaptures(char[][] board) {
        int availableCapture = 0;
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    posX = i;
                    posY = j;
                    break;
                }
            }
        }
        for (int i = posY - 1; i >= 0 ; i--) {
            if(board[posX][i] == 'p') {
                availableCapture++;
                break;
            }
            if(board[posX][i] == 'B') {
                break;
            }
        }

        for (int i = posY + 1; i < 8; i++) {
            if(board[posX][i] == 'p') {
                availableCapture++;
                break;
            }
            if(board[posX][i] == 'B') {
                break;
            }
        }

        for (int j = posX - 1; j >= 0; j--) {
            if(board[j][posY] == 'p') {
                availableCapture++;
                break;
            }
            if(board[j][posY] == 'B') {
                break;
            }
        }

        for (int j = posX + 1; j < 8; j++) {
            if(board[j][posY] == 'p') {
                availableCapture++;
                break;
            }
            if(board[j][posY] == 'B') {
                break;
            }
        }
        return availableCapture;
    }

}
