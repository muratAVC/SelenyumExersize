package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCaseEzersize2 {
@Test
 public void TestCase(){
    //1. Launch browser
    WebDriverManager.chromedriver().setup();
    WebDriver Cdriver=new ChromeDriver();
    Cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Cdriver.manage().window().maximize();

    //2. Navigate to url 'http://automationexercise.com'
    Cdriver.get("http://automationexercise.com");

    //3. Verify that home page is visible successfully
    Assert.assertTrue(Cdriver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());

    //4. Click on 'Signup / Login' button
      Cdriver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

    //5. Verify 'Login to your account' is visible
      Assert.assertTrue(Cdriver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed());

    //6. Enter correct email address and password
        Cdriver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("adilKara@hotmail.com");
        Cdriver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456789");

        //7. Click 'login' button
        Cdriver.findElement(By.xpath("//button[@data-qa='login-button']")).click();

    //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(Cdriver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed());

    //9. Click 'Delete Account' button
    Cdriver.findElement(By.xpath(" //a[text()=' Delete Account']")).click();
    //10. Verify that 'ACCOUNT DELETED!' is visible
    Assert.assertTrue(Cdriver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed());

    Cdriver.close();
 }




}
