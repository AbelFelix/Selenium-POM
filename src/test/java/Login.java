import config.Config;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LoginPage;

public class Login extends Config {

    @Test(testName = "LoginUser001", description = "The user enter a valid username and password and is redirected to the secure area")
    public void test_success_login() throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        login.userLogin("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(home.getPageTitle().toLowerCase().contains("secure area"));
    }

}
