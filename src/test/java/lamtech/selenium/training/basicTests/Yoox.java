package lamtech.selenium.training.basicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yoox {


    public static void main(String[] args) {

        // Set the path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver.exe");


        //Declare driver
        WebDriver driver = new ChromeDriver();

        //Maximise Browser
        driver.manage().window().maximize();


        //Lauch application
        driver.get("https://www.yoox.com");

        //Handle pop up
        //Alert alert = driver.switchTo().alert();

        driver.findElement(By.className("ui-button-text")).click();

        //Click on Register button
        driver.findElement(By.id("register-login")).click();

        //Enter firstname
        driver.findElement(By.name("Name")).sendKeys("Test");

        //Enter Lastname
        driver.findElement(By.id("SurName")).sendKeys("Analyst");

        //Enter email
        driver.findElement(By.id("Email")).sendKeys("testanalyst@gmail.com");

        //Enter Password
        driver.findElement(By.name("Password")).sendKeys("Password123");

        //Enter Gender
        driver.findElement(By.id("Male")).click();

        //Enter Date of Birth
        driver.findElement(By.id("Day")).sendKeys("09");

        //Enter Month of Birth
        driver.findElement(By.name("Month")).sendKeys("05");

        //Enter year of Birth
        driver.findElement(By.id("Year")).sendKeys("1970");

        //Enter Countrycode
        Select countryCode = new Select(driver.findElement(By.className("selected-flag")));
        countryCode.selectByIndex(0);


        driver.findElement(By.className("input[class='form-control js-mobile-number ta-register-phonenumber']")).sendKeys("Albania");

        //Enter Telephone
        //driver.findElement(By.id("MobilePhone")).sendKeys("7384290467");










    }


}
