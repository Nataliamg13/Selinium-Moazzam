package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork01 {
    public static void main(String[] args) {


    //1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    //username=Admin
    //password=Hum@nhrm123
    //2. click on PIM option
    //3. from the table select Any  value of id and click the checkbox associated with it
    //make sure that ur code is dynamic i.e
    //changing the id doesn't affect the logic or xpath
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//     create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//       open up the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        maximize the screen
        driver.manage().window().maximize();
//
//        send the username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//       send the password
        driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
//        click on the login button
        driver.findElement(By.className("button")).click();
        driver.findElement(By.xpath("//a[@class='firstLevelMenu']/b[text()='PIM']")).click();

           //4318210 Natalia GL

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for (int i = 0; i < row.size(); i++) {
            String id=row.get(i).getText();
            if(id.equalsIgnoreCase("52483A")){
                System.out.println(id);
                System.out.println("Row of the ID is "+i+1);
                driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
}
}}
