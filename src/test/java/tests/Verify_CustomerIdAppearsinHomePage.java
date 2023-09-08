package tests;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerLoginpage;

import java.sql.SQLOutput;

public class Verify_CustomerIdAppearsinHomePage extends Base {

    @Test(groups ={"Somke Test"} )
    public void verifyMyFirstTest(){
        System.out.println("First Test");
        //navigate to url
        navigate("https://it.microtechlimited.com");

        //loginAsCustomer
        CustomerLoginpage.logInAsCustomer();

        //.......customer Home page
        //Verify Test'Home page
        String customerMsg = getText(By.xpath("//h2[contains(text(),'Customer')]"));
        //System.out.println("actual msg: "+customerMsg);

        //Assert.assertEquals(customerMsg,"Customer ID: 4");
        Assert.assertEquals(customerMsg,"Customer Id: 4");

    }

    @Test
    public void verifyMySecondTest() {
        System.out.println("Second Test");
        //navigate to url
        navigate("https://it.microtechlimited.com");

        //loginAsCustomer
        CustomerLoginpage.logInAsCustomer();

        //.......customer Home page
        //Verify Test'Home page
        String customerMsg = getText(By.xpath("//h2[contains(text(),'Customer')]"));
        //System.out.println("actual msg: "+customerMsg);

        //Assert.assertEquals(customerMsg,"Customer ID: 4");
        Assert.assertEquals(customerMsg, "Customer Id: 4");
    }
    }

