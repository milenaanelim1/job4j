package job4j.array;

public class Matrix {

    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        int i = 0;
        int j = 0;
        table[i][j] = 1;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
