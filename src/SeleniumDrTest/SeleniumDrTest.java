package SeleniumDrTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDrTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com/"); // navigate to the specified url
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();


        /*System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver(); //launch the browser
        driver2.get("https://www.facebook.com/"); // navigate to the specified url
                driver2.close();



        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver3 = new EdgeDriver(); //launch the browser
        driver3.get("https://www.google.com/"); // navigate to the specified url
        //driver3.close();
*/








    }
}
