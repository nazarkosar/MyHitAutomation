package NK.pageobject.hometest;


import NK.testcase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @Test
    public void testHomePage() throws Exception {

//        Assert.assertTrue(homePage.clickOnSeatchFilm().inputFilmTitle
//                ().scrollToTheActorsListAndClick().theNametOfActor.getText().contains("Jake Gyllenhaal"));

        Assert.assertEquals(homePage.clickOnSeatchFilm().inputFilmTitle
                ().scrollToTheActorsListAndClick().theNametOfActor.getText(), "Jake Gyllenhaal");

//        Assert.assertTrue(homePage.isSearchButtonDisplayed(), "Search button is not displayed");
    }
}
