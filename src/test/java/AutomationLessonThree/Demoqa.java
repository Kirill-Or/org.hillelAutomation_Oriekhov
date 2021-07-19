package AutomationLessonThree;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class Demoqa {

    @Test
    public void firstMethod() throws InvocationTargetException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");

        By bookStoreLocator = By.xpath("//div[contains(@class,'col-md-3')]//div[6]");
        WebElement webElementBookStore = driver.findElement(bookStoreLocator);
        webElementBookStore.click();
        Thread.sleep(1500);// Без средслип не работает) никак

        By loginLocator = By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']");
        WebElement webElementLogin = driver.findElement(loginLocator);
        webElementLogin.click();
        Thread.sleep(1500);


        By userNameLocator = By.xpath("//input[@id='userName']");
        WebElement webElementUserName =driver.findElement(userNameLocator);
        webElementUserName.sendKeys("jonh21");
        Thread.sleep(1500);


        By passwordLocator = By.xpath("//input[@id='password']");
        WebElement webElementPassword =driver.findElement(passwordLocator);
        webElementPassword.sendKeys("Jonh!2345jonh");
        Thread.sleep(1500);



        By loginTwoLocator = By.cssSelector("#login");
        WebElement webElementTwoLogin = driver.findElement(loginTwoLocator);
        webElementTwoLogin.click();
        Thread.sleep(1500);


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        By goStoreLocator = By.cssSelector("#gotoStore");
        WebElement webElementgoStore = driver.findElement(goStoreLocator);
        webElementgoStore.click();
        Thread.sleep(1500);


        By gitLocator = By.cssSelector("a[href='/books?book=9781449325862']");
        WebElement webElementGit = driver.findElement(gitLocator);
        webElementGit.click();
        Thread.sleep(1500);




        jse.executeScript("window.scrollBy(0,250)");
        By addCollectionLocator = By.xpath("//button[normalize-space()='Add To Your Collection']");
        WebElement webElementAddCollection = driver.findElement(addCollectionLocator);
        webElementAddCollection.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(1500);


        By backLocator = By.cssSelector("div[class='text-left fullButton'] button[id='addNewRecordButton']");
        WebElement webElementBack = driver.findElement(backLocator);
        webElementBack.click();
        Thread.sleep(1500);


        jse.executeScript("window.scrollBy(0,250)");
        By jsLocator = By.cssSelector("a[href='/books?book=9781491904244']");
        WebElement webElementJS = driver.findElement(jsLocator);
        webElementJS.click();
        Thread.sleep(1500);


        jse.executeScript("window.scrollBy(0,250)");
        By addCollectionLocatorSecond = By.cssSelector("div[class='text-right fullButton'] button[id='addNewRecordButton']");
        WebElement webElementAddCollectionSecond = driver.findElement(addCollectionLocatorSecond);
        webElementAddCollectionSecond.click();
        Thread.sleep(1500);

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(1500);


        By profileLocator = By.cssSelector("div[class='element-list collapse show'] li[id='item-3']");
        WebElement webElementProfile = driver.findElement(profileLocator);
        webElementProfile.click();
        Thread.sleep(1500);


        jse.executeScript("window.scrollBy(0,250)");
        By deleteLocator = By.cssSelector("div[class='text-right button di'] button[id='submit']");
        WebElement webElementDelete = driver.findElement(deleteLocator);
        webElementDelete.click();
        Thread.sleep(1500);


        jse.executeScript("window.scrollBy(0,250)");
        By deleteLocatorTwo = By.cssSelector("#closeSmallModal-ok");
        WebElement webElementDeleteTwo= driver.findElement(deleteLocatorTwo);
        webElementDeleteTwo.click();
        Thread.sleep(1500);

        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
        Thread.sleep(1500);






    }
}