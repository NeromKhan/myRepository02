package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class Employee_OrderFunctionality extends Base {

    @Test
    public void Employee_OrderFunctionality(){

        navigate("https://it.microtechlimited.com/");

        click(LandingPage.menuLoginBtn);

        EmployeeLoginPage.loginAsEmployee();

        click(EmployeeHomePage.employeeProdMenu);

        dropDownMenu(EmployeeProductOrderPage.employeeDropdownMenu,"5");

        sendkeys(EmployeeProductOrderPage.employeeOrdDate,"06/15/2023");

        click(EmployeeProductOrderPage.employeeOrderSubmitBtn);

        click(EmployeeOrderListPage.employeeOrderList);

        String actualvalue = getText(EmployeeOrderListPage.employeeConfirmStatus);
        Assert.assertEquals(actualvalue,"Confirmed");








    }
}
