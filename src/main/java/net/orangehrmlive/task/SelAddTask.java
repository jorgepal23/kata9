package net.orangehrmlive.task;

import net.orangehrmlive.UI.MenuUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SelAddTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuUI.BTN_ADMIN_BUTTON),
                Click.on(MenuUI.BTN_ADD_BUTTON)
        );
    }
    public static SelAddTask selAccount(){
        return  instrumented(SelAddTask.class);
    }
}