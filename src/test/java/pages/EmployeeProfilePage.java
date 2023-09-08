package pages;

import org.openqa.selenium.By;

public class EmployeeProfilePage {


    public static By employeeFirstName = By.xpath("//input[@name='firstName']");

    public static By employeeLastName = By.name("lastName");

    public static By employeeEmail = By.name("email");

    public static By employeeDateofBirth = By.xpath("//input[@name='birthday']");

    public static By employeeGender = By.name("gender");

    public static By employeerNid = By.xpath("//input[@name='nid']");
    public static By employeeAddress=By.xpath("//input[@value='Monohardi,Narsingdi']");

    public static By employeeDepartment = By.name("dept");

    public static By employeeDegree = By.name("degree");

    public static By employeeTotalSalary =By.name("degree");

    public static By employeeUpdateInfoButton = By.xpath("//button[text()='Update Info']");


}
