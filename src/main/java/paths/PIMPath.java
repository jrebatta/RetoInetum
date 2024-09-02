package paths;

import org.openqa.selenium.By;

public class PIMPath {
    public By aPIM = By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']");
    public By aAddEmployee = By.cssSelector("a.oxd-topbar-body-nav-tab-item[href='#']:contains('Add Employee')");
    public By inputFirstName = By.cssSelector("input[name='firstName']");
    public By inputMiddleName = By.cssSelector("input[name='middleName']");
    public By inputLastName = By.cssSelector("input[name='lastName']");
    public By btnSave = By.cssSelector("button[type='submit']:not([class*='oxd-button--ghost'])");
    public By SuccessfullySaved = By.cssSelector("p.oxd-text.oxd-text--p.oxd-text--toast-message.oxd-toast-content-text");
    public By FirstLastName = By.cssSelector("h6.oxd-text.oxd-text--h6.--strong");
}
