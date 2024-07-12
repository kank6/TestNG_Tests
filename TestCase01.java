

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase01 {
    @Test
    public void displayTC()
    {
        System.out.println("test case display is executed");
        Assert.assertEquals(0,0);
    }
}
