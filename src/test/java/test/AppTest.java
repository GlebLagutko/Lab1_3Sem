package test;

import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try {
            Lab1.main(new String[]{"1"});
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue( true );
        }
    }

    @Test
    public void testParseReturnDefaultValur()
    {
       Assert.assertEquals(1, Lab1.parseDouble("sss", 1), 0);
       Assert.assertEquals(2, Lab1.parseDouble("sss", 2), 0);
       Assert.assertEquals(45,Lab1.parseDouble("45", 2), 0);
       Assert.assertEquals(45.45353,Lab1.parseDouble("45.45353", 2), 0);
       Assert.assertEquals(56.324,Lab1.parseDouble("45,45353", 56.324), 0);
    }


}
