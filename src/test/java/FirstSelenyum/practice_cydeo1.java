package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;

public class practice_cydeo1 {
   @Test
    public void practice(){
       WebDriverManager.chromedriver().setup();
       WebDriver Cdriver=new ChromeDriver();
       Cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Cdriver.get("https://www.cydeo.com");
       Cdriver.navigate().to("https://www.youtube.com");
       Cdriver.navigate().back();
       Cdriver.get("https://practice.cydeo.com/open_new_tab");

    }
}
