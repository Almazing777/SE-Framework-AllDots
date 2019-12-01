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
        FileInputStream fis = new FileInputStream("//Users//Almas//Documents//SE-AllDotsConnected//src//test//java");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if(browserName == "chrome"){
            System.setProperty("webdriver.chrome.driver", "//Users//Almas//Documents//BrowserDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName == "firefox"){
            System.setProperty("webdriver.firefox.driver", "//Users//Almas//Documents//BrowserDriver/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }


}
