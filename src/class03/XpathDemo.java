package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

         driver.manage().window().maximize();

             //open smart bear
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //find the username

        WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");

        //find the password field

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

                      //clear the username text box using method clear()
            username.clear();

        //get the text username which is beside the username text

        WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        usernameText.getText();


        driver.quit();
    }
}
