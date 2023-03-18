package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tablesDynamic {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//     create an instance of WebDriver
     WebDriver driver=new ChromeDriver();
//       open up the website
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        maximize the screen
        driver.manage().window().maximize();
//
//        send the username
       driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//       send the pasword
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
//        click on the login button
       driver.findElement(By.className("button")).click();

// task:check the checkbox containing the product screensaver
        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
//iterate through each to see if it conatins screen saver
        for(int i=0;i<column.size();i++) {
//            extract the text
            String text = column.get(i).getText();
            if (text.equalsIgnoreCase("ScreenSaver")) {
                System.out.println(text);
                System.out.println("the row that contains scrensaver is " + (i + 2));
                System.out.println("check the check box");

                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkbox.click();

            }
        }
        }
}
