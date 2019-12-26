package job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class FactorialTest {
@Test
    public void Factorial5Is120(){
    int result = Factorial.calc(5);
    assertThat(result, is(120));
}
@Test
    public void F1(){
    int result = Factorial.calc(0);
    assertThat(result, is(1));
}

}
