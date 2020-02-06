package job4j.array;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (i == j) {
                    if (board[i][j] == 'X') {
                        for (int index = 0; index != 5; index++) {
                            if ((board[i][j] == board[i + 1][j]) || (board[i][j] == board[i][j + 1])) {
                            result = true;
                            break;}
                        }
                    }
                }
            }
        }
        return result;
    }
}


