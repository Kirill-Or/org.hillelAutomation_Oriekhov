package HomeWorkFifteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class DemoQAFirstQestion {
@Test
    public void demoQUFirstMethod (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com/");

        String getTitle = driver.getTitle() ;
        int titleLength = driver.getTitle().length();
    System.out.println("Page Titles is " + getTitle + " Title length =" + titleLength);
        String expectedTitle = "https://shop.demoqa.com/";
        String actualTitle = driver.getCurrentUrl();
        assertEquals( expectedTitle, actualTitle);
        driver.getPageSource();
        int getSourceLength = driver.getPageSource().length();
    System.out.println( "Source length is : " + getSourceLength);
    driver.quit();





    }


}
