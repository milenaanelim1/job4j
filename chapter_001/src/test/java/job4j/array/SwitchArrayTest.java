package job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to4(){
        int[] input = {9,5,7,6,8,4};
        int[] expect = {9,8,7,6,5,4};
        int[] rsl = SwitchArray.swap(input, 1,4);
        assertThat(rsl, is (expect));
    }

}
