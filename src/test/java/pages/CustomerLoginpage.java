package pages;

import base.Base;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

//locators
public class CustomerLoginpage extends Base {

    public static By customerUserId = By.name("mailuid");

    public static By customerPassword = By.xpath("//input[@name='pwd']");

    public static By customerLoginBtn = By.cssSelector("input[name='login-submit']");
    public static By invalidIdOrPasswordMsg=By.id("error-msg");

    //Actions

    public static void logInAsCustomer(){

        //landing page
        click(LandingPage.menuLoginBtn);
        //click on customer menu button
        click(EmployeeLoginPage.customerLogin);
        //enter customer user Id
        sendkeys(CustomerLoginpage.customerUserId,"david@gmail.com");
        //enter customer password
        sendkeys(CustomerLoginpage.customerPassword,"1234");
        click(CustomerLoginpage.customerLoginBtn);

    }
}
