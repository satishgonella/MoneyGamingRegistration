package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LandingPage {

    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 10);
        PageFactory.initElements(factory, this);
    }


    @FindBy(how = How.XPATH, using = "//*[@class='login_links']/a[2]")
    public WebElement joinNowBtn;

    @FindBy(how = How.XPATH, using = "//select[@id='title']")
    public WebElement titleDropDown;

    @FindBy(how = How.ID, using = "forename")
    public WebElement foreName;

    @FindBy(how = How.NAME, using = "map(lastName)")
    public WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@name='map(terms)']")
    public WebElement termsCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@value='Join Now!']")
    public WebElement joinNowBtnTwo;

    @FindBy(how = How.XPATH, using = "//select[@class='dobYear inline required error']/following-sibling::label[text()='This field is required'][1]")
    public WebElement error;

}


