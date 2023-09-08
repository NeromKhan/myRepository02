package pages;

import org.openqa.selenium.By;

public class EmployeeHomePage {
    public static By empApplyLeaveMenu = By.xpath("//a[@href='applyleave.php?id=102']");
    public static By employeeWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome Test ')]");
    public static By empLeaveStatus = By.xpath("//h2[text()='Leave Satus']");

    public static By employeeProdMenu = By.xpath("//a[text()='Product Order']");

    public static By employeeProfileMenu = By.xpath("//a[text()='My Profile']");


}
