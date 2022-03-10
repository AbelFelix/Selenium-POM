package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver driver;

    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.className("radius");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String strUsername){
        WebDriverWait delay = new WebDriverWait(driver, 20);
        delay.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username).sendKeys(strUsername);
    }

    public void setPassword(String strPassword){
        WebDriverWait delay = new WebDriverWait(driver, 20);
        delay.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(strPassword);
    }

    public void clickLogin() {
        WebDriverWait delay = new WebDriverWait(driver, 20);
        delay.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
        driver.findElement(loginButton).click();
    }

    public void userLogin(String strUsername, String strPassword) throws InterruptedException {
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.clickLogin();
        Thread.sleep(2500);
    }
}
