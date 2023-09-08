package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerHomepage;
import pages.CustomerLoginpage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class Verify_CustomerLoginFunctionality extends Base {

    @Test
    public void verifyCustomerLoginFunctionality() {

        //startUP();

        //navigate to url
        navigate("https://it.microtechlimited.com");

        click(LandingPage.menuLoginBtn);
        click(EmployeeLoginPage.customerLogin);
        sendkeys(CustomerLoginpage.customerUserId,"david@gmail.com");
        sendkeys(CustomerLoginpage.customerPassword,"1234");
        click(CustomerLoginpage.customerLoginBtn);
        String CustomereMsg = getText(CustomerHomepage.customerWelcomeMsg);

        Assert.assertEquals(CustomereMsg,"Welcome David");

//        if(CustomereMsg.contains("David"))
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");

    }
}
