package StepDefs;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static StepDefs.Hooks.driver;

public class screenshot {
    public void capturescreenshot(String testName) throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destPath = "C:\\Users\\lenovo\\Downloads\\SemiCornerGP-master\\Registration Form\\src\\test\\resources" + testName + ".png";

        try {
            FileUtils.copyFile(srcFile, new File(destPath));
        } catch (IOException e) {
            throw new IOException("Failed to save screenshot: " + e.getMessage());
        }
    }
}
