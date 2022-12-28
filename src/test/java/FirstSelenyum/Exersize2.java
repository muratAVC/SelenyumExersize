package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Exersize2 {
@Test
    public void example1() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver drv= new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.navigate().to("http://automationexercise.com");
    Assert.assertTrue(drv.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
    drv.findElement(By.xpath("//a[text()=' Contact us']")).click();
    Assert.assertTrue(drv.findElement(By.xpath("//h2[text()='Get In Touch']")).isDisplayed());
    Actions actions=new Actions(drv);
    actions.sendKeys(drv.findElement(By.xpath("//input[@type='text']")),"Adil")
            .sendKeys(Keys.TAB)
            .sendKeys("adilkara@gmail.com")
            .sendKeys(Keys.TAB)
            .sendKeys("deneme")
            .sendKeys(Keys.TAB)
            .sendKeys("bu bir deneme mesajıdır ne den olmuyor acaba")
            .perform();




            //.sendKeys("C:\\Users\\mergen\\Desktop\\Yeni Metin Belgesi (4).txt")

    WebElement upload_file = drv.findElement(By.xpath("//input[@name='upload_file']"));

    upload_file.sendKeys("C:\\Users\\mergen\\Desktop\\Yeni Metin Belgesi (4).txt");
    //7. Upload file

    drv.findElement(By.xpath("//input[@name='submit']")).click();


    //drv.wait(500);
    //actions.wait(50);

    //actions.sendKeys(Keys.ENTER);
    drv.switchTo().alert().accept();


    //9. Click OK button

    Assert.assertTrue(drv.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed());

    //11. Click 'Home' button and verify that landed to home page successfully
    drv.findElement(By.xpath("//i[@class='fa fa-angle-double-left']")).click();
    Assert.assertTrue(drv.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
    drv.quit();

    }
}
