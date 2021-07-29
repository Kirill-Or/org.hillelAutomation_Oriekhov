package HomeWorkFifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoQAThird {
@Test
    public void demoQUThirdMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/progress-bar");

        WebElement webElementOfStart =driver.findElement(By.xpath("//button[normalize-space()='Start']"));
        webElementOfStart.click();
        WebDriverWait wait = new WebDriverWait(driver, 12);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Reset']")));
        WebElement webElementOfReset =driver.findElement(By.xpath("//button[normalize-space()='Reset']"));
        webElementOfReset.click();
        WebElement webElementOfStartTwo = driver.findElement(By.xpath("//button[normalize-space()='Start']"));
        webElementOfStartTwo.click();


    }
}