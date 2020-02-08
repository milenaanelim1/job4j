package job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
              //  int point = index; // указатель, на не null ячейку.
                for(int ind2 = index+1; ind2<array.length; ind2++){
                    if (array[ind2]!=null){
                        String tmp = array[index];
                        array[index]=array[ind2];
                        array[ind2]=tmp;
                    }
                }
                // переместить первую не null ячейку
                // Здесь нужен цикл while
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

