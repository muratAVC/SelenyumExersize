package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Subscriptions {
@Test
    public void cydeoSubscription(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.navigate().to("https://www.cydeo.com");
    drv.findElement(By.xpath("//*[@id='mega-menu-item-322']/a")).click();
    WebElement logo=drv.findElement(By.xpath("//*[@id='root']/div/div[1]/form/div/div[1]/img"));
    if(logo.isDisplayed()){
        drv.findElement(By.xpath("//*[@id='root']/div/div[1]/form/div/div[2]/input")).sendKeys("muratriyum@gmail.com");
        drv.findElement(By.xpath("//*[@id='root']/div/div[1]/form/button")).click();
        drv.findElement(By.xpath("//*[@id='root']/div/div[1]/form/div/div[2]/input[2]")).sendKeys("9637650584_MA_cy");
        drv.findElement(By.xpath("//*[@id='root']/div/div[1]/form/button")).click();
    }

    }

}
