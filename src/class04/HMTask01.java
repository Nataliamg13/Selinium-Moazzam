package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMTask01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
check if the check box    "click on this check box" is Selected
if no  Select the check box
check gain if the checkbox is Selected or not
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web
applications around the world.
         */

//        tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        driver.manage().window().maximize();

        WebElement checkBox= driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean boxSelected=checkBox.isSelected();

        System.out.println("Is check box selected? "+boxSelected);
        if(!boxSelected){
            checkBox.click();
        }
        boxSelected=checkBox.isSelected();
        System.out.println("Is check box selected? "+boxSelected);
        Thread.sleep(3000);
        driver.close();
    }
}

