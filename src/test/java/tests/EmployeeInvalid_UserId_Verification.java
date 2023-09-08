package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class EmployeeInvalid_UserId_Verification extends Base {

    @Test
    public void employeeInvalid_UserId_Verification(){

        navigate("https://it.microtechlimited.com/");

        click(LandingPage.menuLoginBtn);
        sendkeys(EmployeeLoginPage.employeeUserId,"neromkhan@gmail.com");
        sendkeys(EmployeeLoginPage.employeePassword,"1234");
        click(EmployeeLoginPage.loginBtn);
        String actualvalue = getText(EmployeeLoginPage.invalidUserId);
        Assert.assertEquals(actualvalue,"Invalid username or password!");

    }
}
