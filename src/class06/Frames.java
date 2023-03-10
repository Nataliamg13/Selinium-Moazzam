package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        //go to syntaxprojects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        //switch to iframe which contains

        driver.switchTo().frame(0);
         //this element

        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
//send some text
        textBox.sendKeys("abracadabra");

        //get the text click on from parent window
       driver.switchTo().defaultContent();
       //find the text
       WebElement text=driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());


        driver.switchTo().frame("iframe_a");

        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("the label is "+getLabel.getText());


        driver.switchTo().defaultContent();

        WebElement frame1=driver.findElement(By.xpath(""));
        driver.switchTo();
}}


