package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;


public class ValidateNavBar extends Base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage l = new LandingPage(driver);

        Assert.assertTrue(l.getNavBar().isDisplayed());

    }
}
