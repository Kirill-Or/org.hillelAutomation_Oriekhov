package HomeWorkSixteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FillTheForm {
@Test
    public void demoQUSecondMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");

    WebElement webElementOfName = driver.findElement(By.xpath("//input[@id='firstName']"));
    webElementOfName.sendKeys("John");
    WebElement webElementOfLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
    webElementOfLastName.sendKeys("Smith");
    WebElement webElementOfEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
    webElementOfEmail.sendKeys("John1999@example.com");
    WebElement webElementOfGender = driver.findElement(By.xpath("//label[normalize-space()='Other']"));
    WebElement webElementOfNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
    webElementOfNumber.sendKeys("7776543210");
    WebElement webElementDate = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
    webElementDate.click();
    Select selectMonth = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
    selectMonth.selectByValue("4");
    Select selectYear = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
    selectYear.selectByVisibleText("1999");
    WebElement webElementDateTwo = driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, May 4th, 1999']"));
    webElementDateTwo.click();

   WebElement webElementCheckbox = driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3"));
    webElementCheckbox.click();

 WebElement webElementCheckboxx = driver.findElement(By.cssSelector("#subjectsInput"));//
   webElementCheckboxx.sendKeys("Work?");

   WebElement easyCheckBox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
   easyCheckBox.click();

   WebElement uploadFile = driver.findElement(By.cssSelector("#uploadPicture"));
   String filePath = System.getProperty("user.dir") + "/file.txt";
   uploadFile.sendKeys((filePath));

   WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
   currentAddress.sendKeys("San Francisco");


        // Без понятия, там меняется название страны , как буд-то чекбокс выбран или нет
  // WebElement firstState = driver.findElement(By.xpath("//div[@id='state']//div[@class=' css-yk16xz-control']"));
  //  JavascriptExecutor executor = (JavascriptExecutor)driver;
  //  executor.executeScript("arguments[0].click();", firstState);

   // WebElement asdasd = driver.findElement(By.xpath("//div[contains(@class,'css-1uccc91-singleValue')]"));
   // JavascriptExecutor executor1 = (JavascriptExecutor)driver;
   // executor1.executeScript("arguments[0].click();", asdasd);

   // Select select1 = new Select(driver.findElement(By.cssSelector(".css-1laao21-a11ytext")));
   // select1.selectByValue("2");





}}
