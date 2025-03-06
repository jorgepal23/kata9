package net.orangehrmlive.questions;

import net.orangehrmlive.UI.MenuUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateModifyMenu implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return MenuUI.LBL_MODIFY.resolveFor(actor).isVisible();
    }
    public static Question validate(){
        return new ValidateModifyMenu();
    }
}