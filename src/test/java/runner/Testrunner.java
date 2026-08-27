package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = "src/test/resources/feature",
        glue = "stepDefenition",
        dryRun = false,
        tags = "@LeadCreation",
        plugin =  {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/cucumber.json"
        }
)
public class Testrunner extends AbstractTestNGCucumberTests {
}

