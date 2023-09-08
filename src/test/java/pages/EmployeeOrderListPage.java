package pages;

import org.openqa.selenium.By;

public class EmployeeOrderListPage {

    public static By employeeOrderList = By.xpath("//tbody/tr[last()]/td[last()]/a");

    public static By employeeConfirmStatus = By.xpath("//tbody/tr[last()]/td[6]");
}
