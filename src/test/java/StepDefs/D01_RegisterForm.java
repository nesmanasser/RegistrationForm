package StepDefs;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.p01_Register;

import java.time.Duration;

import static StepDefs.Hooks.driver;

@Listeners(listener.class)
public class D01_RegisterForm {
    @Test
    public void testUserRegistration() {
        p01_Register register = new p01_Register();
        // Fill out the registration form
        register.Firstname().sendKeys("Nesma");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        register.Lastname().sendKeys("Nasser");
        register.email().sendKeys(register.generateEmail());
        register.phone().sendKeys("01155811808");
        Select cources_choice = new Select(register.courses());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        cources_choice.selectByIndex(1);
        Select duration_choice = new Select(register.joindate());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        duration_choice.selectByValue("february");
        register.aboutus().click();
        register.submitbutton().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Verify submission
        boolean SubmissionSuccess = register.ValidateMessage().contains("Your registration is completed");
        System.out.println(register.ValidateMessage());
        Assert.assertTrue(SubmissionSuccess);
    }
}
