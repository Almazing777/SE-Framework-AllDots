package Academy;

import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void basePageNavigation() throws IOException {
        driver = initializeDriver();
        driver.get("http://qaclickacademy.com");
    }

}
