package tests;

import base.Base;
import org.testng.Assert;

import org.testng.annotations.Test;
import pages.CustomerLoginpage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class CustomerInvalid_Password_Verification extends Base {
    @Test
    public  void customerInvalid_Password_Verification(){
        navigate("https://it.microtechlimited.com/");
        click(LandingPage.menuLoginBtn);
        click(EmployeeLoginPage.customerLogin);
        sendkeys(CustomerLoginpage.customerUserId, "david@gmail.com");
        sendkeys(CustomerLoginpage.customerPassword,"1245");
        click(CustomerLoginpage.customerLoginBtn);
        String actualvalue = getText(CustomerLoginpage.invalidIdOrPasswordMsg);
        Assert.assertEquals(actualvalue,"Invalid username or password!");

    }

}
