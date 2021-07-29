package HomeWorkFifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ToolsQA {

@Test
    public void toolsQAFirstMethod () {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,
            TimeUnit.SECONDS);
    driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");


    WebElement newWindow = driver.findElement(By.xpath("//button[normalize-space()='New Window']"));
    newWindow.click();
    for(String winHandle : driver.getWindowHandles()){
        driver.switchTo().window(winHandle);
        driver.close();


}
}
    }