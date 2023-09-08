package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import javax.sound.midi.Soundbank;

public class Employee_UpdateInformation_Phone_Address extends Base {

    @Test

    public void employeeUpdateInformationPhoneAddress() throws InterruptedException {

        navigate("https://it.microtechlimited.com/");

        click(LandingPage.menuLoginBtn);

        EmployeeLoginPage.loginAsEmployee();

        click(EmployeeHomePage.employeeProfileMenu);

        click(EmployeeProfilePage.employeeFirstName);
        click(EmployeeProfilePage.employeeLastName);
        click(EmployeeProfilePage.employeeEmail);

       click(EmployeeProfilePage.employeeDateofBirth);

        click(EmployeeProfilePage.employeeGender);

        click(EmployeeProfilePage.employeeUpdateInfoButton);

        Thread.sleep(4000);
        clear(EmployeeUpdateInformationPage.employeeUpdateContract);
        sendkeys(EmployeeUpdateInformationPage.employeeUpdateContract,"6466594174");

        Thread.sleep(4000);
        clear(EmployeeUpdateInformationPage.employeeUpdateAddress);
        sendkeys(EmployeeUpdateInformationPage.employeeUpdateAddress,"204CurtissSt");

        Thread.sleep(4000);
        click(EmployeeUpdateInformationPage.employeeUpdateSubmitBtn);

        Thread.sleep(4000);
        String actualvalue = getattribute(EmployeeProfilePage.employeerNid,"value");
        System.out.println("employee id "+actualvalue);
        Assert.assertEquals(actualvalue,"303");

        //click(CustomerProfilePage.customerDepartment);

        // clear(CustomerProfilePage.customerDegree);
        //sendkeys(CustomerProfilePage.customerDegree,"Computer Seince");
//
        //clear(CustomerProfilePage.customerTotalSalary);
        //  sendkeys(CustomerProfilePage.customerTotalSalary,"$2000");

    }
}
