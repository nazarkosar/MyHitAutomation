package NK.pageobject.Pages.enteraplication;


import NK.pageobject.Pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ActorPage extends Page {
    @FindBy(how = How.XPATH, using = "//h4")
    public WebElement theNametOfActor;

    public ActorPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String TheActorName() {
        theNametOfActor.getText();
        return theNametOfActor.getText();
    }
}
