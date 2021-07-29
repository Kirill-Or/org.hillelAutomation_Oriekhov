package HomeWorkFifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoQASecond {

    @Test
    public void DemoQASecondMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/");


        WebElement webElementForms = driver.findElement(By.xpath("//h5[normalize-space()='Forms']"));
        webElementForms.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://demoqa.com/");
        driver.navigate().refresh();
        driver.quit();

    }
}