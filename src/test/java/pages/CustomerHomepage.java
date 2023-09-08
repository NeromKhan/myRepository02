package pages;

import org.openqa.selenium.By;

public class CustomerHomepage {

    public static By customerWelcomeMsg = By.xpath("//h2[2]");
    public static By customerOrderMenu =By.xpath("//a[@href='productOrder.php?id=4']");

    public static By customerProfileMenu = By.xpath("//a[@href='custMyProfile.php?id=4']");

}
