package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HMTask02 {
        /*
        Hw2:
goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
1. u need to write down the code that can select  1 check box out of 4 mentioned,
e.g option1 , option2 , option 3, option 4

Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
Syntax - Website to practice Syntax Automation Platform
Syntax Automation Platform has great examples like Ajax, JQuery, Bootstrap etc which are used in most of the web applications around the world.
         */

        public static <WebElement> void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
            driver.manage().window().maximize();

           // List<WebElement> optionCheckBox= driver.findElements(By.cssSelector("input[class='cb1-element']"));
/*
            for (WebElement option: optionCheckBox){
                String checkbox= option.getAttribute("value");
                if(checkbox.equalsIgnoreCase("Option-4")){
                    option.click();
                }
            }
            Thread.sleep(3000);
            driver.close();
*/
        }

}
