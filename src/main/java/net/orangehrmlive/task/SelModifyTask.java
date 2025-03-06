package net.orangehrmlive.task;

import net.orangehrmlive.UI.MenuUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.orangehrmlive.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelModifyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuUI.BTN_ADMIN_BUTTON),
                Enter.theValue(extractTo().get(0).get("USERNAME")).into(MenuUI.BTN_SEARCH_USERNAME),
                Click.on(MenuUI.BTN_SEARCH)
        );
    }
    public static SelModifyTask selAccount(){
        return  instrumented(SelModifyTask.class);
    }
}