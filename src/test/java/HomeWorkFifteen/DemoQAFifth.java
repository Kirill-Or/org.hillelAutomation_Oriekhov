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

public class DemoQAFifth {


    @Test
    public void demoQUThirdMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/dynamic-properties");


        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Visible After 5 Seconds']")));
        WebElement webElementOfWait  = driver.findElement(By.xpath("//button[normalize-space()='Visible After 5 Seconds']"));
        webElementOfWait.click();
        driver.quit();

}
    }