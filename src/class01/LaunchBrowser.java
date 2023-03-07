import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project share the web-driver is located

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");

        //open the website facebook.com
        driver.get("https://www.facebook.com/");

       //get the current url that is there in the browser
        String URL =driver.getCurrentUrl();

       // print the URL
        System.out.println(URL);


        //get the title of the webpage
        String title=driver.getTitle();

        //print the title of this page
        System.out.println("title of the page is "+title);

        // ALT+ENTER /add the exception
        Thread.sleep(3000); // slow down the process 3 milisecond

        //close the browser
        driver.quit();
    }
}