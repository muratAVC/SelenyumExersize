package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class FirstSelenyumClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

       driver.manage().window().maximize();
       driver.get("https://www.amazon.com");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       /*
       List<WebElement> webList=driver.findElements(By.tagName("button"));
        for (WebElement list: webList) {
            System.out.println(list.getText());
        }

       for (int i = 0; i < webList.size(); i++) {
            System.out.println(webList.get(i).getText());
        }*/






      /*
       WebElement name=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
       name.sendKeys("murat.avci@hotmail.com");
       WebElement password= driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
       password.sendKeys("12345678nuty");
       WebElement enter= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
       enter.click();
       WebElement result= driver.findElement(By.xpath("//div[@class='_9ay7']"));
        System.out.println(result.getText());


       */
        //driver.close();




        WebElement AraKutu= driver.findElement(By.id("twotabsearchtextbox"));
        AraKutu.sendKeys("nutella");
        AraKutu.submit();
        WebElement resultBox= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        //System.out.println(resultBox.getText());
        Assert.assertTrue(resultBox.getText().contains("Nutella"));

        //driver.navigate().to("https://www.toyota.com.tr");
        /*driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();*/
        //System.out.println(driver.manage().window().getSize());
        //System.out.println(driver.manage().window().getPosition());
        //driver.manage().window().setPosition(new Point(300,400));
        //driver.manage().window().setSize(new Dimension(400,400));
    }
}
