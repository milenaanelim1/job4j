package job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int index = 0; index != (array.length)/2; index++) {
//4 1 6 2
            //if (array.length%2==0){
                int theme = array[index];
                array[index]=array[array.length-1-index];
                array[array.length-1-index] = theme;
           // }

        }
        return array;
    }
}
