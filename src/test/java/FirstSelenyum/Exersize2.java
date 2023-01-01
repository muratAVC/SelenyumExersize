package FirstSelenyum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

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
    WebElement upload_file = drv.findElement(By.xpath("//input[@name='upload_file']"));
    upload_file.sendKeys("C:\\Users\\mergen\\Desktop\\Yeni Metin Belgesi (4).txt");
    drv.findElement(By.xpath("//input[@name='submit']")).click();
    drv.switchTo().alert().accept();
    Assert.assertTrue(drv.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed());
    drv.findElement(By.xpath("//i[@class='fa fa-angle-double-left']")).click();
    Assert.assertTrue(drv.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
    drv.quit();
    }
    @Test
    public void example2(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        //drv.switchTo().alert().accept();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.navigate().to("http://automationexercise.com");
        Assert.assertTrue(drv.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
        drv.findElement(By.xpath("//a[@href='/products']")).click();
        Assert.assertTrue(drv.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());
        //6. The products list is visible
        drv.findElement(By.xpath("//a[@href='/product_details/1']")).click();
        Assert.assertTrue(drv.findElement(By.xpath("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-5 > div > img")).isDisplayed());
        Assert.assertTrue(drv.findElement(By.xpath("body > section > div > div > div.col-sm-9.padding-right > div.product-details > div.col-sm-7 > div > p:nth-child(6) > b")).isDisplayed());

drv.quit();


        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

    }
    @Test
    public void example3(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.navigate().to("http://automationexercise.com");
        Assert.assertTrue(drv.findElement(By.xpath("//img[@src='/static/images/home/logo.png']")).isDisplayed());
        drv.findElement(By.xpath("//a[@href='/products']")).click();
        Assert.assertTrue(drv.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());
        //drv.switchTo().alert().dismiss();
        drv.findElement(By.xpath("//*[@id=\"search_product\"]")).sendKeys("coat");
        drv.findElement((By.xpath("//*[@id=\"submit_search\"]"))).click();
        Assert.assertTrue(drv.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2")).isDisplayed());
        Assert.assertTrue(drv.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div")).isDisplayed());
        /*
        1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. Enter product name in search input and click search button
7. Verify 'SEARCHED PRODUCTS' is visible
8. Verify all the products related to search are visible
         */
    }

    @Test
    public void vatanB(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        drv.navigate().to("https://www.vatanbilgisayar.com");
        drv.findElement(By.xpath("/html/body/div[8]/div/div[2]")).click();
        //drv.switchTo().alert().dismiss();
        //drv.findElement(By.xpath("//*[@id='\navbar\']/ul/li[4]/a")).click();
        Actions actions=new Actions(drv);
        actions.moveToElement(drv.findElement(By.xpath("//*[@id='navbar']/ul/li[4]/a"))).click();
        actions.click(drv.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/div/div/div/ul[2]/div[2]/li[1]/a")));


        //drv.quit();
    }
    @Test
    public void task5(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        drv.navigate().to("https://login1.nextbasecrm.com/?forgot_password=yes");
        drv.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/div[1]/input")).sendKeys("catr curt");
        drv.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/div[2]/input")).sendKeys("sel@gmail.com");
        drv.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[4]/button")).click();
        Assert.assertTrue(drv.findElement(By.xpath("//*[@id='login-popup']/form/div[2]")).isDisplayed());
    }
    @Test
    public void task6(){
        WebDriverManager.chromedriver().setup();
        WebDriver drv=new ChromeDriver();
        drv.navigate().to("https://practice.cydeo.com/dropdown");
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement drop=drv.findElement(By.xpath("//*[@id='dropdown']"));
        Select select=new Select(drop);
        select.selectByIndex(2);
        //select.selectByValue("2");
        //select.deselectByVisibleText("Option 2");
        String asd=select.getFirstSelectedOption().getText();
        System.out.println(asd);

    }
}
