package AutomationTheSecond;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GlobalsqaThird {
@Test
    public void firstMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(3000);

        By locatorOfManager = By.cssSelector("button[ng-click='manager()']");
        WebElement webElementOfManager = driver.findElement(locatorOfManager);
        webElementOfManager.click();
        Thread.sleep(3000);

        By locator1 = By.xpath("//button[normalize-space()='Open Account']");
        WebElement webElement1 = driver.findElement(locator1);
        webElement1.click();
        Thread.sleep(3000);

        By locatorOfCustomerName = By.xpath("//select[@id='userSelect']");
        WebElement webElementOfCustomerName = driver.findElement(locatorOfCustomerName);
        webElementOfCustomerName.click();
        Thread.sleep(3000);

        By locatorOfSelectName = By.cssSelector("option[value='1']");
        WebElement webElementOfSelectName = driver.findElement(locatorOfSelectName);
        webElementOfSelectName.click();
        Thread.sleep(2000);

        By locatorOfCurrency = By.cssSelector("#currency");
        WebElement webElementOfCurrency = driver.findElement(locatorOfCurrency);
        webElementOfCurrency.click();
        Thread.sleep(2000);

        By locatorOfSelectCurrency = By.cssSelector("option[value='Dollar']");
        WebElement webElementOfSelectCurrency = driver.findElement(locatorOfSelectCurrency);
        webElementOfSelectCurrency.click();
        webElementOfSelectCurrency.submit();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);



    driver.manage().deleteAllCookies();
    driver.quit();






}
}