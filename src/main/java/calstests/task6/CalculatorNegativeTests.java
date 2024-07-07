package calstests.task6;

import calstests.listeners.Retry;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorNegativeTests {
    Calculator calculator = new Calculator();


    @Test
    @Parameters({"num1","num2"})
    public void testAddition1(double num1, double num2){
        double res = calculator.sum(-num1,-num2);
        Assert.assertEquals(res,-num1-num2,"Addition operation failed");
    }



    @Test
    @Parameters({"num1","num2"})
    public void testSubtraction3(double num1, double num2) {
        double result = calculator.sub(-num1, num2);
        Assert.assertEquals(result, -num1-num2, "Subtraction operation failed");
    }

    @Test
    @Parameters({"num1","num2"})
    public void testSubtraction4(double num1, double num2) {
        double result = calculator.sub(-num1, -num2);
        Assert.assertTrue(String.valueOf(result).contains(String.valueOf(-num1+num2)), "Subtraction operation failed");
    }

    @Test(retryAnalyzer = Retry.class)
    @Parameters({"num1","num2"})
    public void testMultiplication(double num1, double num2) {
        double result = calculator.mult(num1,num2);
        Assert.assertEquals(result, num1*num2, "multiplication operation failed");
    }

    @Test(retryAnalyzer = Retry.class)
    @Parameters({"num1","num2"})
    public void testDivision(double num1, double num2) {
        double result = calculator.div(num1,num2);
        Assert.assertEquals(result, num1/num2, "multiplication operation failed");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    @Parameters({"num1", "num2"})
    public void testDivision2(String num1Str, String num2Str) {
        double num1 = Double.parseDouble(num1Str);
        double num2;
        try {
            num2 = Double.parseDouble(num2Str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        double result = calculator.div(num1, num2);
        Assert.assertEquals(result, num1 / num2, "division operation failed");
    }

    @Test
    @Parameters({"num1", "num2"})
    public void testDivision3(double num1, double num2) {
            double result = calculator.div(num1, -num2);
            Assert.assertEquals(result, -num1 / num2, "division operation failed");
    }

}
