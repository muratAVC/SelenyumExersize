package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DenemeAlan {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver drv=new FirefoxDriver();
        drv.navigate().to("https://practice.cydeo.com/checkboxes");
        drv.manage().window().maximize();

        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //drv.findElement(By.xpath("//input[@name='checkbox1']")).click();
        WebElement asd=drv.findElement(By.xpath("//input[@name='checkbox1']"));
        boolean a=asd.isSelected();
        System.out.println("1 check"+a);
        if (a){
            drv.findElement(By.xpath("//input[@name='checkbox1']")).click();
            a=asd.isSelected();
            System.out.println("1 check"+a);
        }
        WebElement asdd=drv.findElement(By.xpath("//input[@name='checkbox2']"));
        boolean ad=asdd.isSelected();
        System.out.println("2 checkbox "+ad);
        if (ad){
            drv.findElement(By.xpath("//input[@name='checkbox2']")).click();
            ad=asd.isSelected();
            System.out.println("1 check"+ad);
        }
        /*drv.findElement(By.xpath("//input[@name='checkbox2']")).click();
        drv.findElement(By.xpath("//input[@name='checkbox1']")).click();
        drv.findElement(By.xpath("//input[@name='checkbox2']")).click();*/
    }
}
