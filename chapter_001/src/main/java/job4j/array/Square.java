package job4j.array;

public class Square {
    public double[] calculate(int bound) {
        double[] rst = new double[bound];
        for ( int index = 0; index != bound; index++) {
            double arr = Math.pow(index + 1,2);
            rst[index]= arr;// заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        }
        return rst;
    }
}
