package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HMTask01 {

    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntax projects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();




        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait1= new WebDriverWait(driver,20);
        wait1.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();


        driver.findElement(By.xpath("display-other-button")).click();
        WebDriverWait wait2= new WebDriverWait(driver,20);
        wait2.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("enable-button")).click();
        WebDriverWait wait3= new WebDriverWait(driver,20);
        //String Enable = text.getText();
       // wait3.until(ExpectedConditions.alertIsPresent());
        //driver.switchTo().alert().accept();


        driver.findElement(By.xpath("checkbox")).click();
        WebDriverWait wait4= new WebDriverWait(driver,20);
        wait4.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();











    }
}
