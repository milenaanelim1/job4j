package job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void tIsMore(){
        int result = MultiMax.max(1,2,3);
        assertThat(result, is(3));
    }
    @Test
    public void sIsMore(){
        int result = MultiMax.max(1,3,2);
        assertThat(result, is(3));
    }
    @Test
    public void fIsMore() {
        int result = MultiMax.max(3, 1, 2);
        assertThat(result, is(3));
    }
    @Test
    public void evIsMore() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}
