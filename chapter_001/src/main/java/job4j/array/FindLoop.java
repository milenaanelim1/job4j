package job4j.array;

public class FindLoop {
    /**
     * public int indexOf(int[] data, int el) {
     * int rst = -1; // если элемента нет в массиве, то возвращаем -1.
     * for (int index = 0; index != data.length; index++) {
     * if (data[index] == el) {
     * rst = index;
     * break;
     * }
     * return rst;
     * }
     */

    public static int indexOf2(int[] data2, int el2, int start, int finish) {
        int rst2 = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = start; index <= finish; index++) {
            if (data2[index] == el2) {
                rst2 = index;
                break;
            }
        }
        return rst2;
    }
}
//}
