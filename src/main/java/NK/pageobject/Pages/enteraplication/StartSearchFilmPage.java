package NK.pageobject.Pages.enteraplication;


import NK.pageobject.Pages.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class StartSearchFilmPage extends Page {
    @FindBy(how = How.XPATH, using = "//input[@id=\"search-page-q\"]")
    public WebElement searchInput;

    //    @FindBy(how = How.XPATH, using = "//div[@id=\"film-list\"]//div[@class=\"row\"][1]//div/b")
    @FindBy(how = How.XPATH, using = "//div[@id='film-list']/div[1]//img")
    public WebElement clickOnFilm;

    public StartSearchFilmPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isSearchInputDisplayed() {
        return searchInput.isDisplayed();
    }

    public FilmPage inputFilmTitle() throws InterruptedException {
        searchInput.click();
        searchInput.sendKeys("Southpaw");
        searchInput.sendKeys(Keys.ENTER);


//        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
//        executor.executeScript("arguments[0].click();", clickOnFilm);

        clickOnFilm.click();
        return PageFactory.initElements(webDriver, FilmPage.class);
    }
}
