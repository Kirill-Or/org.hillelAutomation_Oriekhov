package HomeWorkSixteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
@Test
public class Fourth {
    public void iFrameFirstMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("http://way2automation.com/way2auto_jquery/dropdown.php#load_box");

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@src='dropdown/default.html']"));
        driver.switchTo().frame(iFrame);

        Select select = new Select(driver.findElement(By.cssSelector("body select")));
        select.selectByVisibleText("Austria");
        Select selectTwo = new Select(driver.findElement(By.cssSelector("body select")));
        selectTwo.selectByIndex(26);
        Select selectThree = new Select(driver.findElement(By.cssSelector("body select")));
        selectThree.selectByValue("SriLanka");
    }
}