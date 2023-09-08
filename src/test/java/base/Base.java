package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class Base {

    public static WebDriver driver;

    @BeforeTest
    public static void startUP(){
        WebDriverManager.chromedriver().setup();
        //WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("BeforeTest");
    }


    @AfterTest
    public static void close() throws InterruptedException {
        Thread.sleep(6000);
        //driver.close();//to close Current Browser Tab
        driver.quit();//to close Browser Application windows
        System.out.println("AfterTest");
    }
    public static void navigate(String Url){
        driver.get(Url);
    }



    public static void click(By locator){
        driver.findElement(locator).click();

    }
    public static void sendkeys(By locator,String keys){

        driver.findElement(locator).sendKeys(keys);
    }

    public static String getText(By loctor){
        String s = driver.findElement(loctor).getText();
        return s;
    }
    public static void dropDownMenu(By locator,String value){
        Select se = new Select(driver.findElement(locator));
        se.selectByValue(value);
    }
    public static void clear(By locator){
        driver.findElement(locator).clear();
    }
    public static String getattribute(By locator,String value){
      return driver.findElement(locator).getAttribute(value);

    }


}
