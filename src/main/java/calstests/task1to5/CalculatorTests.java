package calstests.task1to5;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTests {
    Calculator calculator = new Calculator();

    @BeforeSuite
    public void testAddition(){
        System.out.println("Beforesuite:");
        double res = calculator.sum(10.2,10.6);
        Assert.assertEquals(res,10.2+10.6,"Addition operation failed");
    }

    @BeforeTest
    public void testAddition2(){
        System.out.println("BeforeTest:");
        double res = calculator.sum(-10.2,-10.6);
        Assert.assertEquals(res,-10.2-10.6,"Addition operation failed");
    }

    @BeforeClass
    public void testSubtraction2() {
        System.out.println("BeforeClass:");
        double result = calculator.sub(100, 50.3);
        Assert.assertEquals(result, 100-50.3, "Subtraction operation failed");
    }

    @BeforeMethod
    public void testSubtraction3() {
        System.out.println("BeforeMethod:");
        double result = calculator.sub(-11, 21);
        Assert.assertEquals(result, -11-21, "Subtraction operation failed");
    }

    @Test(groups = {"additiontest"})
    public void testAddition3() {
        System.out.println("Test1:");
        double result = calculator.sum(0.001, 1);
        Assert.assertEquals(result, 0.001+1, "addition operation failed");
    }

    @Test(groups = {"substractiontest"})
    public void testSubtraction4() {
        System.out.println("Test2:");
        double result = calculator.sub(-30, -10);
        Assert.assertTrue(String.valueOf(result).contains(String.valueOf(-30+10)), "Subtraction operation failed");
    }

    @Test(groups = {"substractiontest"})
    public void testSubtraction5() {
        System.out.println("Test2:");
        double result = calculator.sub(30, -10);
        Assert.assertEquals(result,30+10, "Subtraction operation failed");
    }

    @AfterMethod(groups = {"multiplication"})
    public void testMultiplication() {
        System.out.println("AfterMethod:");
        double result = calculator.mult(10.2,2.4);
       // Assert.assertEquals(result, 10.2*2.4, "multiplication operation failed");
    }

    @AfterClass(groups = {"divisiontest"})
    public void testDivision() {
        System.out.println("AfterClass:");
        double result = calculator.div(12,6);
        Assert.assertEquals(result, 12/6, "multiplication operation failed");
    }

    @AfterTest
    public void testDivision2() {
        System.out.println("AfterTest:");
        double result = calculator.div(2,6);
        Assert.assertEquals(result, 2/6, "multiplication operation failed");
    }

    @AfterClass(groups = {"divisiontest"})
    public void testDivision3() {
        System.out.println("AfterClass:");
       // double result = calculator.div(2,0);
       // Assert.assertEquals(result, 2/0, "multiplication operation failed");
    }

    @AfterSuite
    public void testDivision4() {
        System.out.println("AfterSuite:");
        double result = calculator.div(40,-10);
        Assert.assertEquals(result, 40/-10, "multiplication operation failed");
    }
}
