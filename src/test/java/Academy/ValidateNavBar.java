package Academy;

import org.junit.After;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;


public class ValidateNavBar extends Base {

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void basePageNavigation() throws IOException {

        LandingPage l = new LandingPage(driver);
        Assert.assertTrue(l.getNavBar().isDisplayed());

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
