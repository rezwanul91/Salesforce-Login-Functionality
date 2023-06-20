package pages;

import base.Base;
import org.openqa.selenium.By;

public class Page_Landing_Page extends Base {
    public static By textUserField = By.id("username");
    public static By textPasswordField = By.id("password");
    public static By buttonField = By.id("Login");

    public static String pageLoginField(String userName, String password) {
        sendkeys(Page_Landing_Page.textUserField, userName);
        sendkeys(Page_Landing_Page.textPasswordField, password);
        click(Page_Landing_Page.buttonField);
        String welcomeMsg = getElementText(Pages_Customer_Home_Page.labelTextMessage);
        return welcomeMsg;
    }

}
