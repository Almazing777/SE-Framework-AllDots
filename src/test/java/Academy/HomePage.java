package Academy;

import org.testng.annotations.DataProvider;
import pageObjects.LoginPage;
import resources.Base;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;

public class HomePage extends Base {

    @Test (dataProvider = "getData")
    public void basePageNavigation(String Username, String Password ) throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");

        LandingPage l = new LandingPage(driver);
        l.getLogin().click();

        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
//        System.out.println(text);
        lp.getLogin().click();
    }

    @DataProvider
    public Object[][] getData(){

        Object[][] data = new Object[1][2];

        //0th row
        data[0][0] = "abc@gmail.com";
        data[0][1] = "123456";
//        data[0][2] = "Restricted User";

        //1st row
//        data[1][0] = "restricteduser@qw.com";
//        data[1][1] = "45678";
//        data[1][2] = "Non restructed user";

        return data;

    }

}
