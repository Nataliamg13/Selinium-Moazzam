package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBts {

    public static void main(String[] args) throws InterruptedException {


//        tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        WebElement maleBtb=driver.findElement(By.cssSelector("input[value='Male']"));
     // check if the radio button is enabled

        boolean isEnabledMale = maleBtb.isEnabled();
        System.out.println("the radio button is enabled "+isEnabledMale);


        //check if the radio button is displayed

       boolean isDisplayedMale=maleBtb.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        //check if the radio button is selected
        boolean isSelectedmale=maleBtb.isSelected();

        System.out.println("the male button is selected "+isSelectedmale);

        //if the radio button is not selected click on it
        if(!isSelectedmale) {

            maleBtb.click();
        }
        //check if the radio button is selected after the click
        isSelectedmale=maleBtb.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);

    }
}
