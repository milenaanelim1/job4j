package job4j.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void Number5isPrime () {
        boolean n5 = CheckPrimeNumber.check(5);
        assertThat(n5, is(true));
    }
    @Test
    public void Num4isNotPrime(){
        boolean n4 = CheckPrimeNumber.check(4);
        assertThat(n4, is(false));
    }
}
