
package testRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/UserRegistration.feature"},
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"},
        glue = {"stepDefinitions"},
        tags = {"@RegisterUser"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
