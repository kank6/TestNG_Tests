package calstests.task10;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomInvokedMethodListener implements IInvokedMethodListener {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        String timeStamp = dateFormat.format(new Date());
        System.out.println("Before Invocation of " + method.getTestMethod().getMethodName() + " at " + timeStamp);
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        String timeStamp = dateFormat.format(new Date());
        System.out.println("After Invocation of " + method.getTestMethod().getMethodName() + " at " + timeStamp);
    }
}
