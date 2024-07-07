package calstests.task6;

import calstests.listeners.Retry;
import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorParameterisedTest {
    Calculator calculator = new Calculator();


    @Test
    @Parameters({"num1","num2"})
    public void testAddition2(double num1, double num2){
        double res = calculator.sum(num1,num2);
        Assert.assertEquals(res,num1+num2,"Addition operation failed");
    }

    @Test
    @Parameters({"num1","num2"})
    public void testSubtraction2(double num1, double num2) {
        double result = calculator.sub(num1, num2);
        Assert.assertEquals(result, num1-num2, "Subtraction operation failed");
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

    @Test(dataProvider = "getadditiondata", dataProviderClass = DataProviderClass.class)
    public void testdataprovider(double num1, double num2, double res){
        double actRes = calculator.sum(num1,num2);
       // System.out.println("testdataprovider:"+actRes);
        Assert.assertEquals(actRes,res,"Addition operation failed");
    }


}
