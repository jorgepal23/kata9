package net.orangehrmlive.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "net.orangehrmlive.StepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LogRunner {
}
