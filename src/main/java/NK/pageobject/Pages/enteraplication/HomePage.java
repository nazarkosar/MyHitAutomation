package NK.pageobject.Pages.enteraplication;


import NK.pageobject.Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Page {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[@href=\"/search/\"]/i")
    public WebElement searchButton;

    public boolean isSearchButtonDisplayed() {
        return searchButton.isDisplayed();
    }

    public StartSearchFilmPage clickOnSeatchFilm() {
        searchButton.click();
        return PageFactory.initElements(webDriver, StartSearchFilmPage.class);
    }

}
