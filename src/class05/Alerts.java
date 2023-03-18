package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

//        tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //  create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //        max the window
        driver.manage().window().maximize();

       //        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        //click on the button for simple prompt alert
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        //use switchTD
       Alert alert = driver.switchTo().alert();
       Thread.sleep(2000);
       alert.accept();

       driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();

      alert.sendKeys("abracadabra");

      alert.accept();
      driver.close();

    }
}
