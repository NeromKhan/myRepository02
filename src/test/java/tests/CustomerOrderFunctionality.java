package tests;

import base.Base;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerHomepage;
import pages.CustomerLoginpage;
import pages.OrderListPage;
import pages.ProductOrderPage;

public class CustomerOrderFunctionality extends Base {

    @Test
    public void customerOrderFunctionality() {
       // Base.startUP();

        navigate("https://it.microtechlimited.com/");

        CustomerLoginpage.logInAsCustomer();

        click(CustomerHomepage.customerOrderMenu);
        //click(ProductOrderPage.dropDownProdName);
        dropDownMenu(ProductOrderPage.dropDownProdName,"7");

        sendkeys(ProductOrderPage.prodOrderDate,"06/07/2023");

        click(ProductOrderPage.buttonProdOrder);

        click(OrderListPage.prodOrderList);

       String t = getText(OrderListPage.confirmStatus);
        Assert.assertEquals(t,"Confirmed");
//       if(t.equals("Confirmed"))
//           System.out.println("pass");
//       else
//           System.out.println("Fail");
//
//      driver.quit();
    }
}
