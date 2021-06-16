import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstFoxTest {



    @Test
    public void firstFoxTest() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.ukr.net/login?lang=ua");

        By locatorOfLogin = By.cssSelector("input[name='login']");
        WebElement inputLogin = driver.findElement(locatorOfLogin);
        inputLogin.sendKeys("Oriekhov_test");

        By locatorOfPassword = By.cssSelector("input[name='password']");
        WebElement inputPassword = driver.findElement(locatorOfPassword);
        inputPassword.sendKeys("HillelTESTAutomation");
        inputPassword.submit();
        driver.manage().deleteAllCookies();
        driver.quit();


    }

}
