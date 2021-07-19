package AutomationLessonThree;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class Univercity {

@Test
    public void firstMethod() throws InvocationTargetException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        WebElement webElementAddNewToDo = driver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        webElementAddNewToDo.sendKeys("MAKE HOMEWORK");
        webElementAddNewToDo.sendKeys(Keys.ENTER);



        WebElement webElementAddSecondToDo = driver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        webElementAddSecondToDo.sendKeys("Practice Automation");
      //  webElementAddSecondToDo.submit();      тесты падают, только сендкейс энтер
    webElementAddSecondToDo.sendKeys(Keys.ENTER);

        WebElement webElementPracticeMagic = driver.findElement(By.xpath("//li[normalize-space()='Practice magic']"));
        webElementPracticeMagic.click();

        Actions action = new Actions(driver);
        WebElement webElementDelete = driver.findElement(By.xpath("//li[normalize-space()='Buy new robes']"));
        action.moveToElement(webElementDelete).build().perform();

        WebElement webElementFullDelete = driver.findElement(By.xpath("//li[normalize-space()='Buy new robes']//i[@class='fa fa-trash']"));
        webElementFullDelete.click();


    }
}