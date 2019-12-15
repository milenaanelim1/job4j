package job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in =180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void dollarToRub(){
        int in= 2;
        int expected= 120;
        int out = Converter.dollarToRub(in);
        Assert.assertEquals(expected,out);
    }

    @Test
    public void euroToRub(){
        int in = 1;
        int expected = 70;
        int out = Converter.EuroToRub(in);
        Assert.assertEquals(expected, out);
    }
}