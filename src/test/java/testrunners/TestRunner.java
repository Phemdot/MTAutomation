package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features = "src/test/resources/features",glue = "steps",tags = "@Regression",plugin = {"pretty","html:target/cucumber=report.html","json:target/cucumber.json"},monochrome=true)

public class TestRunner extends AbstractTestNGCucumberTests {

    TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());

}
