package Academy;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.Base;

import java.io.IOException;


public class ValidateTitle extends Base {

    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized");
        driver.get(prop.getProperty("url"));
        log.info("Navigated to Home page");
    }

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));

        LandingPage l = new LandingPage(driver);

        Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
        log.info("Successfully validated text message");
    }
}
