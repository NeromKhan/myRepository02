package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeHomePage;
import pages.EmployeeLeaveFormPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class Verify_EmployeeApplyLeave extends Base {

    @Test
    public void verify_EmployeeApplyLeave() {
        navigate("https://it.microtechlimited.com/");
        click(LandingPage.menuLoginBtn);
        EmployeeLoginPage.loginAsEmployee();
        click(EmployeeHomePage.empApplyLeaveMenu);
        sendkeys(EmployeeLeaveFormPage.leaveReasonLabel, "Vacations");
        sendkeys(EmployeeLeaveFormPage.enterStartDate, "12/22/2022");
        sendkeys(EmployeeLeaveFormPage.getEnterEndDate, "o6/25/2023");
        click(EmployeeLeaveFormPage.submitButton);
        String actualValue = getText(EmployeeHomePage.empLeaveStatus);
        Assert.assertEquals(actualValue, "Leave Satus");


    }
}
