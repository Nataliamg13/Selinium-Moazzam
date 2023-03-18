package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM02 {
    public static void main(String[] args) throws InterruptedException {
     /*
      HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
TIP for HW2:
just fill in text boxes or button, no need to deal with other webElements
also u will need a Thread.sleep after clcikng on create new account
we will discuss "WHY" in future
      */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        open up fb.com
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Natalia");
        driver.findElement(By.name("lastname")).sendKeys("Gl");
        driver.findElement(By.name("reg_email__")).sendKeys("nattg13@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nattg13@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Uwillnotguess01");
        driver.findElement(By.name("birthday_month")).sendKeys("July");
        driver.findElement(By.name("birthday_day")).sendKeys("22");
        driver.findElement(By.name("birthday_year")).sendKeys("1986");
        driver.findElement(By.name("sex")).click();
       // driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
        driver.findElement(By.name("websubmit")).click();
         driver.findElement(By.xpath("//*[contains(text),'Continue')]")).click();
        driver.findElement(By.linkText("Continue")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}


