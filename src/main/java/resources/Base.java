package resources;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.io.FileHandler;

public class Base {

    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("//Users//Almas//Documents//SE-AllDotsConnected//src//main//java//resources//data.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        String urlName = prop.getProperty("url");
        System.out.println(urlName);

        if(prop.getProperty("browser").equals("chrome")){
            driver = new ChromeDriver();
        }

        else if(prop.getProperty("browser").equals("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public void getScreenshot(String name) throws IOException {
        String screenName= System.currentTimeMillis()+ ".png";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            FileHandler.copy(src, new File(System.getProperty("user.dir") + "/target/Screenshots/" + screenName + ""));

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }
}
