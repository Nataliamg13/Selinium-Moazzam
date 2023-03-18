package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSelector {
    public static void main(String[] args) throws InterruptedException {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https:facebook.com");

         //click on the button to
        WebElement createNewBtn= driver.findElement(By.cssSelector("a[data-testid = 'open-registration-form-button']"));
        //click on the button
        createNewBtn.click();
       // Put a sleep statement so that the browser can open up the window which contains the element
        Thread.sleep(1000);
           //fill in the first name
        WebElement firstName= driver.findElement(By.cssSelector("input[name='firstname']"));

        firstName.sendKeys("abracadabra");

        driver.quit();
    }
}