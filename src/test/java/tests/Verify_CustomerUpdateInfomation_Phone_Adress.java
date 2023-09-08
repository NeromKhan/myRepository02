package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class Verify_CustomerUpdateInfomation_Phone_Adress extends Base {

    @Test
    public void verifyUpdateInformation() throws InterruptedException {

        navigate("https://it.microtechlimited.com/");

        CustomerLoginpage.logInAsCustomer();

        click(CustomerHomepage.customerProfileMenu);

        click(CustomerProfilePage.customerFirstName);
        click(CustomerProfilePage.customerLastName);
        click(CustomerProfilePage.customerEmail);

       // clear(CustomerProfilePage.customerDateofBirth);
        //sendkeys(CustomerProfilePage.customerDateofBirth,"10/20/1994");
        click(CustomerProfilePage.customerDateofBirth);

        //clear(CustomerProfilePage.customerGender);
       // sendkeys(CustomerProfilePage.customerGender,"Female");
        click(CustomerProfilePage.customerGender);

        click(CustomerProfilePage.cusUpdateInfoButton);
        Thread.sleep(4000);
        clear(CustomerUpdatedInformation.customerUpdateContract);
        sendkeys(CustomerUpdatedInformation.customerUpdateContract,"3473587798");
        Thread.sleep(4000);
        clear(CustomerUpdatedInformation.customerUpdateAddress);
        sendkeys(CustomerUpdatedInformation.customerUpdateAddress,"204CurtissSt");
        Thread.sleep(4000);
        click(CustomerUpdatedInformation.CustomerUpdateSubmitBtn);
        Thread.sleep(4000);


    }

}
