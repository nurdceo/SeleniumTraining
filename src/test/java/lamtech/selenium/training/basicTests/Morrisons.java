package lamtech.selenium.training.basicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Morrisons {


    public static void main(String[] args) {


        //Set the path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver.exe");


        //Declare webdriver
        WebDriver driver = new ChromeDriver();


        //Maximise browser
        driver.manage().window().maximize();


        //Launch application
        driver.get("https://groceries.morrisons.com");

        //Click on Register button
        driver.findElement(By.linkText("Register")).click();

        //Enter postcode
        driver.findElement(By.id("postcode")).sendKeys("SE8 5SW");

        //Click on check button
        driver.findElement(By.cssSelector("#postcodeCheckerForm > div.form__inputGroup > div.form__actions.postcodeChecker__actions > input")).click();

        //Select title
        Select titleDropdown = new Select(driver.findElement(By.name("title")));
        titleDropdown.selectByValue("Dr");

        //Enter firstname
        driver.findElement(By.name("firstName")).sendKeys("Daniel");

        //Enter Lastname
        driver.findElement(By.id("lastName")).sendKeys("Adebowale");

        //Enter email
        driver.findElement(By.id("login")).sendKeys("daniela43@gmail.com");

        //Enter password
        driver.findElement(By.name("password")).sendKeys("Password");

        //Click on Register
        driver.findElement(By.cssSelector("#registrationForm > div.form__inputGroup > div.form__actions.registration__actions > input")).click();

        System.out.println("Sign up Successfully");







    }



}
