package job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        double[] rst = square.calculate(bound);
        double[] expect = new double[] {1.0, 4.0, 9.0};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound4Then14916() {
        int bound = 4;
        Square square = new Square();
        double[] rst = square.calculate(bound);
        double[] expect = new double[] {1, 4, 9, 16};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square square = new Square();
        double[] rst = square.calculate(bound);
        double[] expect = new double[] {1.0, 4.0, 9.0, 16.0, 25.0};
        assertThat(rst, is(expect));
    }
}