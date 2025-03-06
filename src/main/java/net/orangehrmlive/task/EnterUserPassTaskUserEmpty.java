package net.orangehrmlive.task;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.orangehrmlive.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterUserPassTaskUserEmpty implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                    Enter.theValue(extractTo().get(1).get("USUARIO")).into(LoginUI.INPUT_USER),
                    Enter.theValue(extractTo().get(1).get("PASS")).into(LoginUI.TXT_PASSWORD)
            );
    }
    public static EnterUserPassTaskUserEmpty enterUserPass() {
        return instrumented(EnterUserPassTaskUserEmpty.class);
    }
}