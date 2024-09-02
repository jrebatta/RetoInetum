package paths;

import org.openqa.selenium.By;

public class LoginPath {

    public static final String url = "https://opensource-demo.orangehrmlive.com/";
    public By inputUser = By.xpath("//input[@name='username']");
    public By inputPassword = By.xpath("//input[@name='password']");
    public By btnLogin = By.xpath("//button[@type='submit']");
    public By loggedInAsElement = By.xpath("//h6");
    public By SuccessfullySaved = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

}
