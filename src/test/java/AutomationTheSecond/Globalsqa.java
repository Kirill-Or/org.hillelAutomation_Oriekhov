package AutomationTheSecond;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Globalsqa {


    @Test
    public void firstMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2000);

        By customerLocator = By.cssSelector("button[ng-click='customer()']");
        WebElement webElementcustomer = driver.findElement(customerLocator);
        webElementcustomer.click();
        Thread.sleep(2000);


        By LocatorOfList = By.xpath("//select[@id='userSelect']");
        WebElement webElementList = driver.findElement(LocatorOfList);
        webElementList.click();
        Thread.sleep(2000);


        By LocatorOfName = By.xpath("//option[@value='2']");
        WebElement webElementNames = driver.findElement(LocatorOfName);
        webElementNames.click();
        Thread.sleep(2000);


        By LocatorOfButton = By.xpath("//button[normalize-space()='Login']");
        WebElement webElementButton = driver.findElement(LocatorOfButton);
        webElementButton.click();
        Thread.sleep(2000);


        By LocatorOfDeposit = By.xpath("//button[normalize-space()='Deposit']");
        WebElement webElementDeposit = driver.findElement(LocatorOfDeposit);
        webElementDeposit.click();
        Thread.sleep(2000);

        By LocatorOfReplenishment = By.xpath("//input[@placeholder='amount']");
        WebElement webElementReplenishment = driver.findElement(LocatorOfReplenishment);
        webElementReplenishment.sendKeys("1000");
        webElementReplenishment.submit();
        Thread.sleep(2000);

        By LocatorOfWithdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
        WebElement webElementWithdrawl = driver.findElement(LocatorOfWithdrawl);
        webElementWithdrawl.click();
        Thread.sleep(2000);

        By LocatorDecrease = By.xpath("//input[@placeholder='amount']");
        WebElement webElementDecrease = driver.findElement( LocatorDecrease);
        webElementDecrease.sendKeys("900");
        webElementDecrease.submit();
        Thread.sleep(2000);

        By LocatorOfTransaction = By.xpath("//button[normalize-space()='Transactions']");
        WebElement webElementTransaction = driver.findElement( LocatorOfTransaction);
        webElementTransaction.click();
        Thread.sleep(2000);

        By LocatorOfTransactionLast = By.xpath("//button[normalize-space()='Reset']");
        WebElement webElementTransactionLast = driver.findElement(LocatorOfTransactionLast);
        webElementTransactionLast.click();
        Thread.sleep(2000);

        driver.manage().deleteAllCookies();
          driver.quit();






    }
}