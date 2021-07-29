package AutomationLessonThree;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class Amazon {

    @Test
    public void firstMethod() throws InvocationTargetException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

        WebElement webElementTodayDeals = driver.findElement(By.xpath("//a[normalize-space()=Today's Deals]"));
        webElementTodayDeals.click();

        WebElement webElementOfDeal = driver.findElement(By.xpath("//button[@id='100 a096f341-announce']"));
        webElementOfDeal.click();

        // Дальше амазон пишет "There's a problem adding this item right now
        //Sorry, there's a problem adding this item to your Cart. Please try again."
        // но будет что-то типо

        WebElement webElementCheckOut =driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
        webElementCheckOut.click();

        WebElement webElementCheckOutLast =driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
        webElementCheckOutLast.click();





}}
