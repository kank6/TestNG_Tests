package calstests.task10;

import org.testng.IInvokedMethodListener;
import org.testng.ITestListener;
import org.testng.internal.annotations.IAnnotationFinder;

import java.util.ArrayList;
import java.util.List;

public class ListenerFactory {

    public static List<Object> createListeners() {
        List<Object> listeners = new ArrayList<>();
        listeners.add(new CustomTestListener());
        listeners.add(new CustomInvokedMethodListener());
        return listeners;
    }
}
