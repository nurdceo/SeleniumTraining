package lamtech.selenium.training.basicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bluePrism {

        public static void main(String[] args) {


            //Set path for browser driver
            System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");


            //Declare Webdriver
            WebDriver driver = new ChromeDriver();

            //Maximise browser
            driver.manage().window().maximize();

            //Launch application
            driver.get("https://www.blueprism.com/");

            //Fill application
            driver.findElement(By.cssSelector("body > div.nav > div.main-nav > div > div > div.right.ml-auto.flex.align-center > a.btn.nav-btn-small.gtm-btn-home")).click();

            //Enter firstname
            driver.findElement(By.name("FirstName")).sendKeys("Test");

            //Enter Lasrname
            driver.findElement(By.id("LastName")).sendKeys("Analyst");

            //Enter email
            driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");

            //Enter Company name
            driver.findElement(By.name("Company")).sendKeys("Ipsusuk Limited");

            //Enter title
            driver.findElement(By.id("Title")).sendKeys("Engineer");

            //Enter phone number
            driver.findElement(By.id("Phone")).sendKeys("0743829031");

            //Enter country
            Select countryDropdown = new Select(driver.findElement(By.cssSelector("#Country")));
            countryDropdown.selectByValue("United Kingdom");

            //driver.findElement(By.cssSelector("#Country")).sendKeys("United Kingdom");

            //Enter Industry
            driver.findElement(By.name("Industry")).sendKeys("Education");

            //Enter website
            driver.findElement(By.name("Website")).sendKeys("http://www.tester.com");

            //Enter your interest
            driver.findElement(By.id("areaofInterest")).sendKeys("New Partnership");

            //Enter what you need help with
            driver.findElement(By.name("MktoPersonNotes")).sendKeys("Account Validation");

            //Click submit button
            driver.findElement(By.className("mktoButtonRow")).click();


            //Sign up confirmation
            System.out.println("Sign up Succesfully");




        }



}
