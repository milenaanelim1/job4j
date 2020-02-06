package job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                if (array[array.length - index - 1] != null) {

                    String point = array[index];

                    array[index] = array[array.length - index - 1];

                    array[array.length - index - 1] = point;
                }

                else if(array[array.length - index - 1] == null){
                    for(int index2 = 0; index2 < array.length; index2++) {

                        String point = array[index];

                        array[index] = array[array.length - index2 - 1];

                        array[array.length - index2 - 1] = point;
                    }
                }
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


// [index +1] while (array[index]!= array[array.length-1]