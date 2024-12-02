package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @BeforeTest
    public void open() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://codenboxautomationlab.com/registration-form/");
        // Implicitly Wait.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
        @AfterTest
        public void close () {
            driver.quit();
        }
    }
