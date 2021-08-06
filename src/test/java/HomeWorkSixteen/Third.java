package HomeWorkSixteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Third {



    @Test
    public void demoQUFirstMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/text-box");


        WebElement webElement = driver.findElement(By.cssSelector("#userName"));
        webElement.sendKeys("John Smith");

        WebElement webElementEmail = driver.findElement(By.cssSelector("#userEmail"));
        webElementEmail.sendKeys("JohnSmith@example.com");

        WebElement webElementCurrentAddress = driver.findElement(By.cssSelector("#currentAddress"));
        webElementCurrentAddress.sendKeys("San Francisco");

        WebElement webElementAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        webElementAddress.sendKeys("New York");
        webElementAddress.submit();



}
    }