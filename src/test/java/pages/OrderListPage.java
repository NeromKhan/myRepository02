package pages;

import org.openqa.selenium.By;

public class OrderListPage {

    public static By prodOrderList = By.xpath("//tbody/tr[last()]/td[last()]/a");

    public static By confirmStatus = By.xpath("//tbody/tr[last()]/td[6]");


}
