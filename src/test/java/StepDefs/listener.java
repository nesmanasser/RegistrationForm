package StepDefs;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class listener extends screenshot implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            capturescreenshot(result.getName()); // Save screenshot with test name
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
