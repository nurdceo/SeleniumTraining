package lamtech.selenium.training.basicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mecury {

    public static void main(String[] args) {

        //Set the path for browser driver
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver.exe");

        //Declare Webdriver
        WebDriver driver = new ChromeDriver();

        //Maximize browser
        driver.manage().window().maximize();

        //Launch application
        driver.get("http://newtours.demoaut.com/");

        //Click on Register
        driver.findElement(By.linkText("REGISTER")).click();


        //Declare Variables to hold Registration Form User Details
        String firstname = "Michaal";
        String lastname = "Jordan";
        String phoneNumber = "07432842628";
        String userName = "michaeljordan@yahoo.com";
        String address1 = "21, Raul Road";
        String address2 = "Peckham";
        String city = "London";
        String state = "Greater London";
        String postalCode = "SE15 4SR";
        String name = "country";
        String email = "michaeljordan@yahoo.com";
        String password = "jordan22";
        String confirmpassword = "jordan22";
       // WebElement = driver.findElements(By.name("register"));




        //Store Web Elements into Variables
        WebElement firstName =  driver.findElement(By.name("firstName"));
        WebElement lastName = driver.findElement(By.name("lastName"));


        //Fill out Registration Form
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);



        driver.findElement(By.name("phone")).sendKeys(phoneNumber);

        driver.findElement(By.name("userName")).sendKeys(userName);


        
        driver.findElement(By.name("address1")).sendKeys(address1);

        driver.findElement(By.name("address2")).sendKeys(address2);

        driver.findElement(By.name("city")).sendKeys(city);

        driver.findElement(By.name("state")).sendKeys(state);

        driver.findElement(By.name("postalCode")).sendKeys(postalCode);


        //Select country
        Select countryDropdown = new Select(driver.findElement(By.name(name)));
        countryDropdown.selectByIndex(245);



        driver.findElement(By.name("email")).sendKeys(email);

        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);

        driver.findElement(By.name("register")).click();

        //Confirm that Account Registration is successful
        //ToDO - Revisit when we start framework
        System.out.println(driver.getTitle());



    }












}
