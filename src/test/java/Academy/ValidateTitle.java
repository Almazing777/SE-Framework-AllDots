package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;


public class ValidateTitle extends Base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage l = new LandingPage(driver);

        Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");

    }
}
