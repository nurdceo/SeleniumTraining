package lamtech.selenium.training.basicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooHoo {


    public static void main(String[] args) throws InterruptedException {


        // Set the path for browser driver
          System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver.exe");


        // Declare Webdriver
        WebDriver driver = new ChromeDriver();

        // Maximize browser
           driver.manage().window().maximize();

        // Launch application
           driver.get("https://www.boohoo.com");

           Thread.sleep(3000);

        //driver.findElement(By.className("welcome-popup-shopping-btn")).click();

        //Handle pop up box
        //Alert alert = driver.switchTo().alert();
        //alert.dismiss();

        //driver.findElement(By.cssSelector("a[class='welcome-popup-shopping-btn']")).click();
        //Thread.sleep(5000);

        //driver.findElement(By.className("span[class='user-account']")).click();

        //driver.findElement(By.cssSelector("li[class='user-info']")).click();

        //driver.findElement(By.className("user-account")).click();
        //Thread.sleep(3000);

        driver.findElement(By.className("welcome-popup-shopping-btn")).click();


        driver.findElement(By.cssSelector("a[title='Register']")).click();
       /// driver.findElement(By.linkText("Register")).click();
        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[4]/div[1]/div/div[2]/div[1]/div[3]/li/div/div/div/a[2]")).click();

        //Select title
       //Select titleDropdown = new Select(driver.findElement(By.name("title")));
        //titleDropdown.selectByValue("Ms");
        //Thread.sleep(3000);

        driver.findElement(By.id("dwfrm_profile_customer_title_title")).sendKeys("Ms");


        // Fill application form
          driver.findElement(By.id("dwfrm_profile_customer_firstname")).sendKeys("Ajekemi");

         //Enter Lastname
          driver.findElement(By.id("dwfrm_profile_customer_lastname")).sendKeys("Yussuf");

          //Enter date of birthday
          driver.findElement(By.name("dwfrm_profile_customer_dayofbirth")).sendKeys("10");

          //Enter month of birth
          driver.findElement(By.name("dwfrm_profile_customer_monthofbirth")).sendKeys("08");

          //Enter year of birth
          driver.findElement(By.name("dwfrm_profile_customer_yearofbirth")).sendKeys("1995");

          //Enter Gender
          driver.findElement(By.name("dwfrm_profile_customer_gender")).sendKeys("Female");

          //Enter email
          driver.findElement(By.id("dwfrm_profile_customer_email")).sendKeys("ajekemik44@gmail.com");

          //Enter email confirmation
          driver.findElement(By.name("dwfrm_profile_customer_emailconfirm")).sendKeys("ajekemik44@gmail.com");

        //Enter Password
        driver.findElement(By.xpath("//input[contains(@id,'dwfrm_profile_login_password_')]")).sendKeys("Password");

        //Enter Password confirmation
        driver.findElement(By.xpath("//input[contains(@id,'dwfrm_profile_login_passwordconfirm_')]")).sendKeys("Password");

        //Click on Register
        driver.findElement(By.name("dwfrm_profile_confirm")).click();


        //Sign up Successfully
        System.out.println("Sign Up Successfully");

        System.out.println(driver.getTitle());
    }




}
