package Academy.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new
                FileInputStream("//Users//Almas//Documents//SE-AllDotsConnected//src//main//java//resources//data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if(prop.getProperty("browser").equals("chrome")){
            driver = new ChromeDriver();
        }

        else if(prop.getProperty("Browser").equals("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }


}
