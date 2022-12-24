package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import java.time.Duration;
import java.util.List;

public class SecondSelenyumNotMainClass {

    @Test
    public void testMetot(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.Amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*List<WebElement> webList=driver.findElements(By.tagName("button"));
        for (WebElement list: webList) {
            System.out.println(list.getText());
        }*/

        /*
        for (int i = 0; i < webList.size(); i++) {
            System.out.println(webList.get(i).getText());
        }*/



        WebElement AraKutu= driver.findElement(By.id("twotabsearchtextbox"));
        AraKutu.sendKeys("nutella");
        AraKutu.submit();
        WebElement resultBox= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        //System.out.println(resultBox.getText());
        //Assert.assertTrue(resultBox.getText().contains("nutella"));
        Assert.assertFalse(resultBox.getText().contains("Kutella"));



        driver.close();
    }

}
