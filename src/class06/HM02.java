package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HM02 {

    public static void main(String[] args) {
/*
HW2
1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
2.Switch to the iframe on the page
3.Clear the existing text in the  editor inside the iframe
4.Enter the text "Hello World!" in the editor inside the iframe
5.Switch back to the main page
 */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Switch to the iframe on the page
        driver.switchTo().frame(0);
        driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);

        //Clear the existing text in the  editor inside the iframe
        WebElement text = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        text.clear();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        //Enter the text "Hello World!" in the editor inside the iframe
        text.sendKeys("Hello World");
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        //Switch back to the main page
        driver.switchTo().frame(0);
        driver.close();
    }
    }

