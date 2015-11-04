package NK.testcase;


import NK.pageobject.Pages.enteraplication.HomePage;
import NK.pageobject.webdriver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected WebDriver webDriver;
    protected HomePage homePage;

    @BeforeMethod
    @Parameters({"browserName"})
    public void setup(String browserName) throws Exception {
        webDriver = WebDriverFactory.getInstance(browserName);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webDriver.get("https://my-hit.org/");
        homePage = PageFactory.initElements(webDriver, HomePage.class);

    }

    @AfterMethod
    public void tearDown() throws Exception {
        if (webDriver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }
}
