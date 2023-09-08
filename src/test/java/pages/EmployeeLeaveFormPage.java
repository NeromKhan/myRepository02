package pages;

import org.openqa.selenium.By;

public class EmployeeLeaveFormPage {
    public static By leaveReasonLabel = By.name("reason");
    public static By enterStartDate = By.name("start");
    public static By getEnterEndDate = By.name("end");
    public static By submitButton = By.xpath("//button[text()='Submit']");
}
