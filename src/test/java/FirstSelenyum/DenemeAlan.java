package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DenemeAlan {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.get("https://login1.nextbasecrm.com/");
        WebElement label= drv.findElement(By.xpath("//label[@for='USER_REMEMBER']"));
        Assert.assertTrue(label.getText().contains("Remember me on this computer"));
        WebElement pass=drv.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
        System.out.println(pass.getText());
        Assert.assertTrue(pass.getText().contains("FORGOT YOUR PASSWORD?"));
        pass.getAttribute("href").contains("forgot_password=yes");
        drv.close();
    }
}
