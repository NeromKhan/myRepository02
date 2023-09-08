package pages;

import org.openqa.selenium.By;

public class EmployeeProductOrderPage {

    public static By employeeProId = By.xpath("//input[@name='empId']");

    public static By employeeDropdownMenu = By.xpath("//select[@name='prodId']");

    public static By employeeOrdDate = By.xpath("//input[@name='ordDate']");

    public static By employeeOrderSubmitBtn = By.xpath("//button[text()='Order Product']");
}
