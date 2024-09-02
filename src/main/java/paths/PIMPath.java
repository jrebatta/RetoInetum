package paths;

import org.openqa.selenium.By;

public class PIMPath {
    public By aPIM = By.xpath("//a[@class='oxd-main-menu-item active' and .//span[text()='PIM']]\n");
    public By aAddEmployee = By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']\n");
    public By inputFirstName = By.xpath("//input[@name='firstName']");
    public By inputMiddleName = By.xpath("//input[@name='middleName']");
    public By inputLastName = By.xpath("//input[@name='lastName']");
    public By btnSave = By.xpath("//form//input[@class='oxd-input oxd-input--active']");
    public By SuccessfullySaved = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");
    public By FirstLastName = By.xpath("//h6[@class='oxd-text oxd-text--h6 --strong']");


}
