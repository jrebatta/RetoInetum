package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        tags = "@Test1",
        glue = "stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty","json:target/cucumber/report.json"}
)
public class Runner {


}