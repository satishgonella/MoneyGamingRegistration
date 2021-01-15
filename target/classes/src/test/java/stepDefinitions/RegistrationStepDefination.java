package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.LandingPage;

public class RegistrationStepDefination extends SetUp {
    LandingPage landing;

    @Given("I am on a Money Gaming Landing Page")
    public void i_am_on_a_Money_Gaming_Landing_Page() {
        String baseUrl = "https://moneygaming.qa.gameaccount.com/";
        driver.get(baseUrl);
        System.out.println("Browser opened");
    }

    @When("I clicked on JOIN NOW button")
    public void i_clicked_on_JOIN_NOW_button() {
        driver.findElement(By.tagName("body")).sendKeys("Keys.ESCAPE");
        landing = new LandingPage(driver);
        landing.joinNowBtn.click();
    }

    @And("I enter the following details {string}, {string}, {string}")
    public void iEnterTheFollowingDetails(String Title, String FirstName, String Surname) {
        driver.findElement(By.tagName("body")).sendKeys("Keys.ESCAPE");
        Select td = new Select(landing.titleDropDown);
        td.selectByVisibleText(Title);
        landing.foreName.sendKeys(FirstName);
        landing.lastName.sendKeys(Surname);
        //System.out.println(landing.termsCheckBox.isSelected());
        landing.termsCheckBox.click();
    }


    @When("I select the checkbox and click on JoinNow button")
    public void i_select_the_checkbox_and_click_on_JoinNow_button() {
        landing.joinNowBtnTwo.click();
    }

    @Then("verify field level error message is displayed")
    public void verify_field_level_error_message_is_displayed() {
        String errorMessage = landing.error.getText();
        System.out.println(errorMessage);
        Assert.assertEquals(errorMessage, "This field is required");
    }
}


