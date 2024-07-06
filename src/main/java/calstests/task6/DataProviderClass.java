package calstests.task6;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "getadditiondata")
    public static Object[][] getadditiondata(){
        return new Object[][]{
                { 10.0, 20.0, 30.0 },
                { -5.0, 5.0, 0.0 },
                { 0.0, 0.0, 0.0 },
                { -10.0, -20.0, -30.0 }
        };
    }
}

