package job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        for (int index2 = 0; index2 != data.length; index2++) {

            int min = MinDiapason.findMin(data, index2, data.length - 1);
            int index = FindLoop.indexOf2(data, min, 0, data.length - 1);

            int tmp = data[index];
            data[index] = data[index2];
            data[index2] = tmp;

        }
        return data;
    }

}


