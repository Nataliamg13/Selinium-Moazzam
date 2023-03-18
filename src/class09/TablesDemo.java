package class09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//     create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
}
