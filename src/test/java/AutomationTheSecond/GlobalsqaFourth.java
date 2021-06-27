package AutomationTheSecond;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GlobalsqaFourth {

    @Test
    public void firstMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(3000);

        By locatorOfManager = By.cssSelector("button[ng-click='manager()']");
        WebElement webElementOfManager = driver.findElement(locatorOfManager);
        webElementOfManager.click();
        Thread.sleep(3000);


        By locatorOfCustomers = By.cssSelector(".btn.btn-lg.tab[ng-class='btnClass3']");
        WebElement webElementOfCustomers = driver.findElement(locatorOfCustomers);
        webElementOfCustomers.click();
        Thread.sleep(3000);



        for (int i=0; i < 5 ; i++) {
            WebElement webElementFor = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
            webElementFor.click();
            Thread.sleep(4000);
        }


        Thread.sleep(2000);

        driver.manage().deleteAllCookies();
        driver.quit();
        // Жаль что вот-так как-то нельзя, ну или у меня просто не вышло)
      /*  By a = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        while (driver.findElement(a)  == true ){
        WebElement webElementFor = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]"));
            webElementFor.click();
            Thread.sleep(4000);} */

      // а это по обычному, вдруг через фор неправильно)
    /*    By locatorOfHermione = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        WebElement webElementOfHermione = driver.findElement(locatorOfHermione);
        webElementOfHermione.click();
        Thread.sleep(3000);

        By locatorOfHarry = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        WebElement webElementOfHarry = driver.findElement(locatorOfHarry);
        webElementOfHarry.click();
        Thread.sleep(3000);

        By locatorOfRon = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        WebElement webElementOfRon = driver.findElement(locatorOfRon);
        webElementOfRon.click();
        Thread.sleep(3000);

        By locatorOfAlbus = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        WebElement webElementOfAlbus = driver.findElement(locatorOfAlbus);
        webElementOfAlbus.click();
        Thread.sleep(3000);

        By locatorOfNeville = By.xpath("//tbody/tr[1]/td[5]/button[1]");
        WebElement webElementOfNeville = driver.findElement(locatorOfNeville);
        webElementOfNeville.click();
        Thread.sleep(3000);    */


    }
}
