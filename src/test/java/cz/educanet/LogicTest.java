package cz.educanet;

import org.junit.Assert;
import org.junit.Test;

public class LogicTest {
    private final Logic logic = new Logic();

    @Test
    public void testAdd() {
        Assert.assertEquals(93, logic.add(75, 18));
    }

    @Test
    public void testDifference() {
        Assert.assertEquals(97, logic.subtract(108, 11));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(91, logic.multiply(7, 13));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(13d, logic.divide(143d, 11d));
    }

    @Test
    public void testPower() {
        Assert.assertEquals(125, logic.power(5, 3));
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, logic.factorial(5));
    }
}