package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Exercize1 {
    @Test
    public void login1(){
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver Cdriver=new ChromeDriver();
        //2. Navigate to url 'http://automationexercise.com'
        Cdriver.manage().window().maximize();
        Cdriver.get("http://automationexercise.com");
        Cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //3. Verify that home page is visible successfully
        WebElement homePageVisible= Cdriver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
        Assert.assertTrue(homePageVisible.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement login=Cdriver.findElement(By.xpath("//i[@class='fa fa-lock']"));
        login.click();
        //5. Verify 'New User Signup!' is visible
        WebElement newuserVisible= Cdriver.findElement(By.xpath("//div[@class='signup-form']"));
        Assert.assertTrue(newuserVisible.isDisplayed());

        //6. Enter name and email address
        Cdriver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("AdilKaragoz");
        Cdriver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("adilKara@hotmail.com");

        //7. Click 'Signup' button
        Cdriver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountVisible=Cdriver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(enterAccountVisible.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title=Cdriver.findElement(By.xpath("//input[@id='id_gender1']"));
        title.click();
        Cdriver.findElement(By.xpath("//input[@id='name']")).sendKeys("Adil Karagoz");
        Cdriver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
        WebElement birth_d= Cdriver.findElement(By.xpath("//select[@id='days']"));
        birth_d.sendKeys("04");
        WebElement birth_M= Cdriver.findElement(By.xpath("//select[@id='months']"));
        birth_M.sendKeys("04");
        WebElement birth_Y= Cdriver.findElement(By.xpath("//select[@id='years']"));
        birth_Y.sendKeys("1980");

        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement sign_chek=Cdriver.findElement(By.xpath("//input[@id='newsletter']"));
        sign_chek.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement recevie1= Cdriver.findElement(By.xpath("//input[@id='optin']"));
        recevie1.click();
        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firs_name=Cdriver.findElement(By.xpath("//input[@id='first_name']"));
        firs_name.sendKeys("Adil");
        WebElement last_name=Cdriver.findElement(By.xpath("//input[@id='last_name']"));
        last_name.sendKeys("Kaaragoz");
        WebElement company=Cdriver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("Google inh.");
        WebElement adress1=Cdriver.findElement(By.xpath("//input[@id='address1']"));
        adress1.sendKeys("yeşilyurt mah 2. sok. no 23");
        WebElement adress2=Cdriver.findElement(By.xpath("//input[@id='address2']"));
        adress2.sendKeys("Seyhan ADANA");
        WebElement country=Cdriver.findElement(By.xpath("//select[@id='country']"));
        country.sendKeys("Canada");
        WebElement state=Cdriver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("British Colombia");
        WebElement city=Cdriver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("Whencover");
        WebElement zipCode=Cdriver.findElement(By.xpath("//input[@id='zipcode']"));
        zipCode.sendKeys("800064");
        WebElement telNumber=Cdriver.findElement(By.xpath("//input[@id='mobile_number']"));
        telNumber.sendKeys("+905122256585");

        //13. Click 'Create Account button'
        WebElement buttonLog= Cdriver.findElement(By.xpath("//button[@data-qa='create-account']"));
        buttonLog.click();
        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCre= Cdriver.findElement(By.xpath("//h2[@class='title text-center']"));
        Assert.assertTrue(accountCre.isDisplayed());

        //15. Click 'Continue' button
        Cdriver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        //16. Verify that 'Logged in as username' is visible

        //17. Click 'Delete Account' button
        Cdriver.findElement(By.xpath(" //a[text()=' Delete Account']")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(Cdriver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed());
        Cdriver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();


    Cdriver.close();
    }



}
