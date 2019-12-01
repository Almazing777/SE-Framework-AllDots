package Academy;

import pageObjects.LoginPage;
import resources.Base;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");

        LandingPage l = new LandingPage(driver);
        l.getLogin().click();

        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys("abc@gmail.com");
        lp.getPassword().sendKeys("12314124");
    }

}
