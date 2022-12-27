package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
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

    @Test
    public void task1(){
       WebDriverManager.chromedriver().setup();
       WebDriver Cdriver=new ChromeDriver();
       Cdriver.get("https://www.yahoo.com");
        WebElement tit=Cdriver.findElement(By.xpath("//title[text()='Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos']"));
       Assert.assertFalse(tit.getText().contains("Yahoo"));
        System.out.println(tit.getText());
       Cdriver.close();
    }
    @Test
    public void task2(){
       WebDriverManager.chromedriver().setup();
       WebDriver drv=new ChromeDriver();
       drv.manage().window().maximize();
       drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       drv.get("https://practice.cydeo.com");
       WebElement tit= drv.findElement(By.xpath("//title[text()='Practice']"));
       //Assert.assertTrue(tit.getText().contains("Practice"));


        drv.close();

    }
    @Test
    public void etsyTask(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.get("https://www.etsy.com");
        WebElement search= drv.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        search.sendKeys("wooden spoon");
        search.submit();
        WebElement tit= drv.findElement(By.xpath("//title[text()='Wooden spoon - Etsy']"));

        System.out.println("+"+drv.getTitle());
        drv.close();
    }
@Test
public void task3(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.get("http://zero.webappsecurity.com/login.html");
    WebElement log= drv.findElement(By.xpath("//h3[text()='Log in to ZeroBank']"));
    Assert.assertTrue(log.getText().contains("Log in to ZeroBank"));

    //System.out.println(log.getText());
    drv.close();


}
@Test
public void taskGoogle(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.get("http://google.com");
    //drv.findElement(By.xpath("//div[@class='gb_Ef']")).click();
    drv.findElement(By.xpath("//a[@class='gb_j']")).click();
    Assert.assertTrue(drv.getTitle().contains("Gmail"));
    drv.navigate().back();
    Assert.assertTrue(drv.getTitle().contains("Google"));

    drv.close();
}
@Test
public void task1_day3(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.get("https://login1.nextbasecrm.com/");
    drv.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("incorrect");
    drv.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("incorrect");
    drv.findElement(By.xpath("//input[@class='login-btn']")).click();
    WebElement result=drv.findElement(By.xpath("//div[@class='errortext']"));
    Assert.assertTrue(result.getText().contains("Incorrect login or password"));
    drv.close();
}

@Test
public void task4_day2(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.get("https://login1.nextbasecrm.com/");
    WebElement label= drv.findElement(By.xpath("//label[@for='USER_REMEMBER']"));
    Assert.assertTrue(label.getText().contains("Remember me on this computer"));
    WebElement pass=drv.findElement(By.xpath("//a[@class='login-link-forgot-pass']"));
    Assert.assertTrue(pass.getText().contains("FORGOT YOUR PASSWORD?"));
    pass.getAttribute("href").contains("forgot_password=yes ");
    drv.quit();

}
@Test
public void task5_day3(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.get("https://login1.nextbasecrm.com/?forgot_password=yes");
    WebElement reset=drv.findElement(By.xpath("//button[@class='login-btn']"));
    Assert.assertTrue(reset.getAttribute("value").contains("Reset password"));
    drv.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("incottect");
    reset.click();
    Assert.assertTrue(drv.findElement(By.xpath("//div[@class='errortext']")).getText().contains("Login or E-mail not found"));



    drv.quit();
}
@Test
public void day4_task1(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.navigate().to("https://practice.cydeo.com/forgot_password");
    WebElement home= drv.findElement(By.xpath("//a[@class='nav-link']"));
    WebElement head=drv.findElement(By.xpath("//h2[text()='Forgot Password']"));
    WebElement maill=drv.findElement(By.xpath("//label[@for='email']"));
    WebElement mailinpubox= drv.findElement(By.xpath("//input[@name='email']"));
    WebElement passbut=drv.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
    WebElement povcy=drv.findElement(By.xpath("//div[@style='text-align: center;']"));
    Assert.assertTrue(home.isDisplayed());
    Assert.assertTrue(maill.isDisplayed());
    Assert.assertTrue(head.isDisplayed());
    Assert.assertTrue(mailinpubox.isDisplayed());
    Assert.assertTrue(passbut.isDisplayed());
    Assert.assertTrue(povcy.isDisplayed());
    drv.quit();

}
@Test
public void day4_task3(){
    WebDriverManager.chromedriver().setup();
    WebDriver drv=new ChromeDriver();
    drv.manage().window().maximize();
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    drv.navigate().to("http://practice.cydeo.com/multiple_buttons ");
    drv.findElement(By.xpath("//button[text()='Button 1']")).click();
    Assert.assertTrue(drv.findElement(By.xpath("//p[text()='Clicked on button one!']")).isDisplayed());
    drv.quit();

}
@Test
public void day4_odev1(){
       WebDriverManager.chromedriver().setup();
       WebDriver drv=new ChromeDriver();
       drv.navigate().to("https://automationexercise.com/");
       drv.manage().window().maximize();
       drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Actions actions=new Actions(drv);
    drv.findElement(By.xpath("//a[@href='/login']")).click();
    actions.sendKeys(drv.findElement(By.xpath("//input[@type='text']")),"veli")
            .sendKeys(Keys.TAB)
            .sendKeys("asdf@gmail.com")
            .sendKeys(Keys.TAB).perform();
            drv.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    actions.click(drv.findElement(By.xpath("//input[@id='id_gender1']")))
            .sendKeys(Keys.TAB)
            .sendKeys("veli")
            .sendKeys(Keys.TAB)
            .sendKeys("pasword")
            .sendKeys(Keys.TAB)
            .sendKeys("04")
            .sendKeys(Keys.TAB)
            .sendKeys("04")
            .sendKeys(Keys.TAB)
            .sendKeys("1980")
            .sendKeys(Keys.TAB)
            .click()
            .sendKeys(Keys.TAB)
            .click()
            .sendKeys("veli")
            .sendKeys(Keys.TAB)
            .sendKeys("tunc")
            .sendKeys(Keys.TAB)
            .sendKeys("google")
            .sendKeys(Keys.TAB)
            .sendKeys("yaşijyurt mah 15 sok")
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys("Canada")
            .sendKeys(Keys.TAB)
            .sendKeys("murat")
            .sendKeys(Keys.TAB)
            .sendKeys("adana")
            .sendKeys(Keys.TAB)
            .sendKeys("01800")
            .sendKeys(Keys.TAB)
            .sendKeys("123456789")
            .sendKeys(Keys.TAB)
            .click().perform();
    drv.quit();

}


}
