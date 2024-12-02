package pages;

import StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Random;

public class p01_Register {


    public WebElement Firstname() {
        return Hooks.driver.findElement(By.id("nf-field-17"));
    }

    public WebElement Lastname() {
        return Hooks.driver.findElement(By.id("nf-field-18"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("nf-field-19"));
    }

    public WebElement phone() {
        return Hooks.driver.findElement(By.id("nf-field-20"));
    }

    public WebElement courses() {
        return Hooks.driver.findElement(By.id("nf-field-22"));
    }

    public WebElement joindate() {
        return Hooks.driver.findElement(By.id("nf-field-24"));
    }

    public WebElement aboutus() {
        return Hooks.driver.findElement(By.id("nf-label-class-field-23-0"));
    }

    public WebElement submitbutton() {
        return Hooks.driver.findElement(By.id("nf-field-15"));
    }

    public String ValidateMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class='nf-response-msg'] p")).getText();
    }

    public static String generateEmail() {
        Random random = new Random();
        int randomNumber = random.nextInt(1000); // Generates a random number between 0 and 999
        return "user" + randomNumber + "@gmail.com";
    }
}
