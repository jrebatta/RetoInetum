package base;

import hook.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Base {

    protected WebDriver driver;

    public Base() {
        driver = DriverManager.getDriver(); // Usa la instancia de DriverManager
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator) {
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void visit(String url) {
        driver.get(url);
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void choose(String number, By locator) {
        Select selectList = new Select(findElement(locator));
        selectList.selectByValue(number);
    }

    public void chooseByText(String text, By locator) {
        Select selectList = new Select(findElement(locator));
        selectList.selectByVisibleText(text);
    }

    public void waitForElement(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitForElementToBeClickable(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}

