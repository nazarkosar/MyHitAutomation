package NK.pageobject.Pages.enteraplication;


import NK.pageobject.Pages.Page;
import NK.pageobject.Sikuli.SikuliImageRecognition;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FilmPage extends Page {

    @FindBy(how = How.XPATH, using = "//div/h4//.")
    public WebElement movieTitle;

    @FindBy(how = How.XPATH, using = "//div[@class=\"row\"][4]")
    public WebElement theActorslist;

//    @FindBy(how = How.XPATH, using = "//ul[@class=\"list-unstyled\"]//li[10]/a[1]")
//    public WebElement theActor;

    public FilmPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean movieTitleIsDisplayed() {
        return movieTitle.isDisplayed();
    }

    public ActorPage scrollToTheActorsListAndClick() {
        ((JavascriptExecutor) webDriver).executeScript
                ("arguments[0].scrollIntoView(true);", theActorslist);
        SikuliImageRecognition imageRecognition = new SikuliImageRecognition();
        imageRecognition.clickOnImage("Jake Gyllenhaal.png");


        return PageFactory.initElements(webDriver, ActorPage.class);
    }
}
