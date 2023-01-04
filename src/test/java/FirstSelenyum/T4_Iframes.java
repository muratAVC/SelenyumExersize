package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T4_Iframes {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.navigate().to("https://practice.cydeo.com/iframe");

        WebElement ifrm=drv.findElement(By.tagName("iframe"));
        drv.switchTo().frame(ifrm);

        Assert.assertTrue(drv.findElement(By.xpath("//*[@id='tinymce']")).isDisplayed());
        drv.switchTo().parentFrame();
        Assert.assertTrue(drv.findElement(By.xpath("//*[@id='content']/div/h3")).isDisplayed());


        /*
        4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
         */
    }

}
