package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {

    //Locators
    public static By employeeLogin = By.linkText("Employee Login");

    public static By customerLogin = By.xpath("//a[text()='Customer Login']");

    public static By employeeUserId = By.name("mailuid");

    public static By employeePassword = By.xpath("//input[@name='pwd']");

    public static By loginBtn = By.cssSelector("input[name='login-submit']");

    public static By invalidUserId = By.id("error-msg");

    //Actions
    public static void loginAsEmployee(){

        sendkeys(EmployeeLoginPage.employeeUserId,"testpilot@gmail.com");
        sendkeys(EmployeeLoginPage.employeePassword,"1234");
        click(EmployeeLoginPage.loginBtn);

    }

}

