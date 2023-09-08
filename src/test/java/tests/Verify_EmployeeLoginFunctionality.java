package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class Verify_EmployeeLoginFunctionality extends Base{

    @Test
    public void verifyEmployeeLoginFunctionality() {

        //startUP();
        //navigate to url
        navigate("https://it.microtechlimited.com");

        click(LandingPage.menuLoginBtn);
        click(EmployeeLoginPage.employeeLogin);
        sendkeys(EmployeeLoginPage.employeeUserId,"testpilot@gmail.com");
        sendkeys(EmployeeLoginPage.employeePassword,"1234");
        click(EmployeeLoginPage.loginBtn);
        //String WelcomeMsg = getText(EmployeeLoginPage.customerLogin);
        String WelcomeMsg = getText(EmployeeHomePage.employeeWelcomeMsg);

        Assert.assertEquals(WelcomeMsg,"Welcome Test");
//        if(WelcomeMsg.contains("Test"))
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");

    }
}
