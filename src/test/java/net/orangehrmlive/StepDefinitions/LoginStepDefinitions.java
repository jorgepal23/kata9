package net.orangehrmlive.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.orangehrmlive.questions.ValidateOkPage;
import net.orangehrmlive.questions.ValidateRequiredPass;
import net.orangehrmlive.questions.ValidateRequiredUser;
import net.orangehrmlive.questions.ValidateWelcomePage;
import net.orangehrmlive.task.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {
    @Managed(driver = "MicrosoftEdge")
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.edgedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }
    @Given("The user open the URL")
    public void theUserOpenTheURL() {
        theActorCalled("User").wasAbleTo(
                OpenURLTask.openBrowser());
    }
    @Given("Enter the user and password and click to dominio button")
    public void enterTheUserAndPasswordAndClickToDominioButton() {
        theActorCalled("User").wasAbleTo(
                EnterUserPassTaskWrong.enterUserPass());
    }
    @Given("Enter the empty user and password and click to dominio button")
    public void enter_the_empty_user_and_password_and_click_to_dominio_button() {
        theActorCalled("User").wasAbleTo(
                EnterUserPassTaskUserEmpty.enterUserPass());
    }
    @When("The user click in the button Ingresar")
    public void TheUserClickInTheButtonIngresar(){
        theActorCalled("User").wasAbleTo(
                EnterThePageTask.enterThePage());
    }
    @Then("The user will be see the welcome page")
    public void theUserWillBeSeeTheWelcomePage() {
        theActorCalled("User").should(
                seeThat(ValidateWelcomePage.validate(), Matchers.equalTo(true)));
    }

    @Then("The user will be see the required page")
    public void the_user_will_be_see_the_required_page() {
        theActorCalled("User").should(
                seeThat(ValidateRequiredUser.validate(), Matchers.equalTo(true)));
    }

    @After
    public void closeBrowser () {
        if (driver != null) {
            driver.quit();
        }
    }

    @And("Enter the user and password empty and click to dominio button")
    public void enterTheUserAndPasswordEmptyAndClickToDominioButton() {
        theActorCalled("User").wasAbleTo(
                EnterUserPassTaskPassEmpty.enterUserPass());
    }

    @And("Enter the user and password ok and click to dominio button")
    public void enterTheUserAndPasswordOkAndClickToDominioButton() {
        theActorCalled("User").wasAbleTo(
                EnterUserPassTaskOk.enterUserPass());
    }

    @Then("The user will be see the password required page")
    public void theUserWillBeSeeThePasswordRequiredPage() {
        theActorCalled("User").should(
                seeThat(ValidateRequiredPass.validate(), Matchers.equalTo(true)));
    }

    @Then("The user will be see the OK page")
    public void theUserWillBeSeeTheOKPage() {
        theActorCalled("User").should(
                seeThat(ValidateOkPage.validate(), Matchers.equalTo(true)));
    }
}