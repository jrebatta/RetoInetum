package paths;

import org.openqa.selenium.By;

public class LoginPath {

    public static final String url = "https://opensource-demo.orangehrmlive.com/";
    public By inputUser = By.cssSelector("input[name='username']");
    public By inputPassword = By.cssSelector("input[name='password']");
    public By btnLogin = By.cssSelector("button[type='submit']");
    public By loggedInAsElement = By.cssSelector("h6");
}
