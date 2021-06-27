package AutomationTheSecond;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GlobalsqaSecond {

    @Test
    public void firstMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

        By locatorOfManager = By.cssSelector("button[ng-click='manager()']");
        WebElement webElementOfManager = driver.findElement(locatorOfManager);
        webElementOfManager.click();
        Thread.sleep(2000);

        By locatorOfAdd = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass1']");
        WebElement webElementOfAdd = driver.findElement(locatorOfAdd);
        webElementOfAdd.click();
        Thread.sleep(2000);

        By locatorOfName = By.cssSelector("input[placeholder='First Name']");
        WebElement webElementOfName = driver.findElement(locatorOfName);
        webElementOfName.sendKeys("George");
        Thread.sleep(2000);

        By locatorOfLastName = By.cssSelector("input[placeholder='Last Name']");
        WebElement webElementOfLastName = driver.findElement(locatorOfLastName);
        webElementOfLastName.sendKeys("Georgeovic");
        Thread.sleep(2000);

        By locatorOfPostCode = By.cssSelector("input[placeholder='Post Code']");
        WebElement webElementOfPostCode = driver.findElement(locatorOfPostCode);
        webElementOfPostCode.sendKeys("61000");
        webElementOfPostCode.submit();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        By locatorOfOpenAccount = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass2']");
        WebElement webElementOfOpenAccount = driver.findElement(locatorOfOpenAccount);
        webElementOfOpenAccount.click();

        Thread.sleep(2000);

        driver.manage().deleteAllCookies();
        driver.quit();









    }
}