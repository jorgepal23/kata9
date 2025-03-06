package net.orangehrmlive.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.orangehrmlive.questions.ValidateAddMenu;
import net.orangehrmlive.questions.ValidateDeleteMenu;
import net.orangehrmlive.questions.ValidateModifyMenu;
import net.orangehrmlive.task.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class MenuStepDefinitions {
    @Managed(driver = "MicrosoftEdge")
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.edgedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }
    @Given("The user click the admin button and click button add")
    public void theUserClickTheAdminButtonAndClickButtonAdd() {
        theActorCalled("User").wasAbleTo(
                SelAddTask.selAccount());
    }
    @When("The user fill the user dates and click button save")
    public void theUserFillTheUserDatesAndClickButtonSave() {
        theActorCalled("User").wasAbleTo(
                EnterAddTask.selAccount());
    }
    @Then("User add succesfully")
    public void userAddSuccesfully() {
        theActorCalled("User").should(
                seeThat(ValidateAddMenu.validate(), Matchers.equalTo(true)));
    }
    //ajustar los steps
    @Given("The user click the admin button and fill the username and click button search")
    public void theUserClickTheAdminButtonAndFillTheUsernameAndClickButtonSearch() {
        theActorCalled("User").wasAbleTo(
                SelModifyTask.selAccount());
    }
    @When("The user click the edit button and fill the user dates and click button save")
    public void theUserClickTheEditButtonAndFillTheUserDatesAndClickButtonSave() {
        theActorCalled("User").wasAbleTo(
                EnterModifyTask.selAccount());
    }
    @Then("User modify succesfully")
    public void userModifySuccesfully() {
        theActorCalled("User").should(
                seeThat(ValidateModifyMenu.validate(), Matchers.equalTo(true)));
    }
    @When("The user click the delete button and click button sure delete")
    public void theUserClickTheDeleteButtonAndClickButtonSureDelete() {
        theActorCalled("User").wasAbleTo(
                SelDeleteTask.selAccount());
    }
    @Then("User delete succesfully")
    public void userDeleteSuccesfully() {
        theActorCalled("User").should(
                seeThat(ValidateDeleteMenu.validate(), Matchers.equalTo(true)));
    }
    @After
    public void closeBrowser () {
        if (driver != null) {
            driver.quit();
        }
    }
}
