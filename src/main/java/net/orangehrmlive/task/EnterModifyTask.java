package net.orangehrmlive.task;

import net.orangehrmlive.UI.MenuUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.orangehrmlive.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterModifyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuUI.BTN_EDIT),
                Click.on(MenuUI.BTN_ROLE),
                Click.on(MenuUI.TXT_ROLEM),
                Click.on(MenuUI.BTN_STATUS),
                Click.on(MenuUI.TXT_STATUSM),
                Click.on(MenuUI.BTN_CHANGE),
                Click.on(MenuUI.BTN_PASSWORD),
                Enter.theValue(extractTo().get(1).get("PASSWORD")).into(MenuUI.BTN_PASSWORD),
                Click.on(MenuUI.BTN_CONFIRMPASSWORD),
                Enter.theValue(extractTo().get(1).get("CPASSWORD")).into(MenuUI.BTN_CONFIRMPASSWORD),
                Click.on(MenuUI.BTN_SAVE)
        );
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static EnterModifyTask selAccount(){
        return  instrumented(EnterModifyTask.class);
    }
}