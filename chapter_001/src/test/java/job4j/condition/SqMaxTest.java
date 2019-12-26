package job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void fIsMax(){
    int result = SqMax.max(5,2,3,4);
    assertThat(result,is(5));
}
    @Test
    public void sIsMax(){
        int result = SqMax.max(2,5,3,4);
        assertThat(result,is(5));
    }
    @Test
    public void tIsMax(){
        int result = SqMax.max(7,1,8,5);
        assertThat(result,is(8));
    }
    @Test
    public void lIsMax(){
        int result = SqMax.max(4,2,3,5);
        assertThat(result,is(5));
    }
    @Test
    public void evIsMax(){
        int result = SqMax.max(5,5,5,5);
        assertThat(result,is(5));
    }
}
