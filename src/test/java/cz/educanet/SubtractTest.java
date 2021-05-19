package cz.educanet;

import junit.framework.TestCase;
import org.junit.Test;

public class SubtractTest extends TestCase {

    @Test
    public void testSubtract() {
        Logic logic = new Logic();
        int result = logic.subtract(109, 11);
        assertEquals(91, result);
    }
}