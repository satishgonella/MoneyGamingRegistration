package stepDefinitions;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

    @Before
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/mac_ChromeDriver/chromedriver");
        SetUp.driver = new ChromeDriver();
        SetUp.driver.manage().deleteAllCookies();
        SetUp.driver.manage().window().maximize();
    }

    @After
    public void takeScreenshot(Scenario scenario) {

        final byte[] screenshot = ((TakesScreenshot) SetUp.driver).getScreenshotAs(OutputType.BYTES);
        // embed it in the report.
        scenario.embed(screenshot, "image/png");
        SetUp.driver.quit();
    }

}
