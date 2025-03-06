package net.orangehrmlive.task;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.orangehrmlive.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class EnterUserPassTaskOk implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    Enter.theValue(extractTo().get(3).get("USUARIO")).into(LoginUI.INPUT_USER),
                    Enter.theValue(extractTo().get(3).get("PASS")).into(LoginUI.TXT_PASSWORD)
            );
    }
    public static EnterUserPassTaskOk enterUserPass() {
        return instrumented(EnterUserPassTaskOk.class);
    }
}