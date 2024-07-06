package calstests.task10;

import org.testng.ITestNGListenerFactory;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

public class CustomTestRunner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();

        // Create a list of XmlSuite
        List<XmlSuite> suites = new ArrayList<>();
        XmlSuite suite = new XmlSuite();
        suite.setName("Custom Test Suite");

        // Create a XmlTest and add your test classes to it
        XmlTest test = new XmlTest(suite);
        test.setName("Calculator Parameterised Tests");
        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("calstests.task6.CalculatorParameterisedTest"));
        test.setXmlClasses(classes);

        // Add the test to the suite
        List<XmlTest> tests = new ArrayList<>();
        tests.add(test);
        suite.setTests(tests);

        // Add the suite to the list
        suites.add(suite);

        // Set the XmlSuites to TestNG instance
        testNG.setXmlSuites(suites);

        testNG.addListener(new CustomTestListener());
        testNG.addListener(new CustomInvokedMethodListener());

        // Run the tests using TestNG instance
        testNG.run();
    }
}
