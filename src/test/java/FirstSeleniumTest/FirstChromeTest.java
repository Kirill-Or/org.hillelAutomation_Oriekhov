package FirstSeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstChromeTest {



    @Test
public void firstChromeTest (){
        System.setProperty("webdriver.сhrome.driver", System.getProperty("user.dir")+ "/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
       driver.get("https://accounts.ukr.net/login?lang=ua");

        By locatorOfLogin = By.cssSelector("input[name='login']");
        WebElement inputLogin = driver.findElement(locatorOfLogin);
        inputLogin.sendKeys("Oriekhov_test");

        By locatorOfPassword = By.cssSelector("input[name='password']");
        WebElement inputPassword = driver.findElement(locatorOfPassword);
        inputPassword.sendKeys("HillelTESTAutomation");
        inputPassword.submit();
        driver.manage().deleteAllCookies();
     //   driver.quit();
}





}
