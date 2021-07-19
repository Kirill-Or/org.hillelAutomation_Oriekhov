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

public class saucedemo {
    @Test
    public void firstMethod() throws InvocationTargetException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen(); // возвращается обратно на пол экрана
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");

        WebElement webElementOfLogin = driver.findElement(By.xpath("//input[@id='user-name']"));
        webElementOfLogin.sendKeys("standard_user");

        WebElement webElementOfPassword = driver.findElement(By.xpath("//input[@id='password']"));
        webElementOfPassword.sendKeys("secret_sauce");
        webElementOfPassword.submit();

// не работает
    /*   for (int i = 1; i < 5; i++) ;
       WebElement webElementOfItem = driver.findElement(By.xpath("//div[i]/div[2]/div[2]/button[1]"));
       webElementOfItem.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1500); */

        WebElement element = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);

        WebElement secondItem = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        JavascriptExecutor executorTwo = (JavascriptExecutor)driver;
        executorTwo.executeScript("arguments[0].click();", secondItem);

        WebElement thirdItem = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt"));
        JavascriptExecutor executorThree = (JavascriptExecutor)driver;
        executorThree.executeScript("arguments[0].click();", thirdItem);

        WebElement fourthItem = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket"));
        JavascriptExecutor executorFour = (JavascriptExecutor)driver;
        executorFour.executeScript("arguments[0].click();", fourthItem);

        WebElement webElementCart = driver.findElement(By.cssSelector(".shopping_cart_link"));
        webElementCart.click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        WebElement webElementCheckout = driver.findElement(By.cssSelector("#checkout"));
        webElementCheckout.click();

        WebElement webElementOfName = driver.findElement(By.cssSelector("#first-name"));
        webElementOfName.sendKeys("FirstName");
        WebElement webElementOfLast = driver.findElement(By.cssSelector("#last-name"));
        webElementOfLast.sendKeys("LastName");
        WebElement webElementOfZip = driver.findElement(By.cssSelector("#postal-code"));
        webElementOfZip.sendKeys("61000");

        WebElement webElementOfContinue = driver.findElement(By.cssSelector("#continue"));
        webElementOfContinue.click();

        WebElement webElementOfFinish = driver.findElement(By.cssSelector("#finish"));
        webElementOfFinish.click();

        WebElement webElementOfHome = driver.findElement(By.cssSelector("#back-to-products"));
        webElementOfHome.click();












    }

}
