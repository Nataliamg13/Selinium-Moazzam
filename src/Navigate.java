import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {


                 //connect with the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //initiate the instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //Open google.com
        driver.get("https://google.com"); // They both use to open the driver but you cant go back with GET

        Thread.sleep(3000);  //it will slow-downs the process with 2 min

        //now navigate to facebook.com
        driver.navigate().to("https:www.facebook.com/");   // IT HAS THE ABILITY TO GET BACK
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        // only with .navigate.back it will work, but with
        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.close();
    }
}
