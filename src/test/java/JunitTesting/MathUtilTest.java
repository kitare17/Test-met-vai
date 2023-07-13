package JunitTesting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {

    @Test
    public void divide() {
        final int expect =3;
        final int actual=MathUtil.divide(9,3);
        Assert.assertEquals(actual,expect);


    }
    @Test
    public void divide1() {
        final int expect =6;
        final int actual=MathUtil.divide(9,3);
        Assert.assertEquals(actual,expect);

    }
    @Test
    public void add() {
        final int expect =4;
        final int actual=MathUtil.add(9,3);
        Assert.assertEquals(actual,expect);
    }
}