package NK.pageobject.hometest;


import NK.testcase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @Test
    public void testHomePage() throws Exception {

//        String startSearchFilmPage = homePage.clickOnSeatchFilm().inputFilmTitle
//                ().scrollToTheActorsListAndClick().TheActorName();



//        Assert.assertTrue(homePage.clickOnSeatchFilm().inputFilmTitle
//                ().scrollToTheActorsListAndClick().theNametOfActor.getText().contains("Jake Gyllenhaal"));

        Assert.assertEquals(homePage.clickOnSeatchFilm().inputFilmTitle
                ().scrollToTheActorsListAndClick().theNametOfActor.getText(), "Jake Gyllenhaal");

//        Assert.assertTrue(homePage.isSearchButtonDisplayed(), "Seatch button is not displayed");
    }
}
