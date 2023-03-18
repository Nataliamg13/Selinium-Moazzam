package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM01 {
    public static void main(String[] args) throws InterruptedException {
        /*
    HW1:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
*/

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Natalia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Glusco");
        driver.findElement(By.id("customer.address.street")).sendKeys("3812 Borman Ct");
        driver.findElement(By.id("customer.address.city")).sendKeys("Gulf Shores");
        driver.findElement(By.id("customer.address.state")).sendKeys("AL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("36542");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("222-222-2222");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("Nataliamg13");
        driver.findElement(By.id("customer.password")).sendKeys("Uwillnotguess");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Uwillnotguess", Keys.ENTER);
        Thread.sleep(3000);
        //driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    }

