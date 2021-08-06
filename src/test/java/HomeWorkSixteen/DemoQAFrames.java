package HomeWorkSixteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoQAFrames {

    @Test
    public void demoQUFirstMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/frames");


        driver.switchTo().frame((driver.findElement( By.xpath("//iframe[@id='frame1']"))));
        String firstIFrame = driver.findElement(By.cssSelector("#sampleHeading")).getText();
        System.out.println(firstIFrame);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
        String secondIFrame = driver.findElement(By.cssSelector("#sampleHeading")).getText();
        System.out.println(secondIFrame);


    }
}