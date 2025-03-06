package net.orangehrmlive.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/menu.feature",
        glue = "net.orangehrmlive.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class MenuRunner {
}
