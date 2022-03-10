package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    By pageTitle = By.xpath("//*[@class='example']//h2");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.findElement(pageTitle).getText();
    }
}
