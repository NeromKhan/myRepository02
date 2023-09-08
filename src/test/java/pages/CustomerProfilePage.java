package pages;

import org.openqa.selenium.By;

public class CustomerProfilePage {

    public static By customerFirstName = By.xpath("//input[@name='firstName']");

    public static By customerLastName = By.name("lastName");

    public static By customerEmail = By.name("email");

    public static By customerDateofBirth = By.xpath("//input[@name='birthday']");

    public static By customerGender = By.name("gender");

    public static By customerNid = By.xpath("//input[@name='nid']");
    public static By customerAddress = By.xpath("//input[@value='Monohardi,Narsingdi']");

    public static By cusUpdateInfoButton = By.xpath("//button[text()='Update Info']");



}
