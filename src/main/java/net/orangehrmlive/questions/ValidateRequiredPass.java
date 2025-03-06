package net.orangehrmlive.questions;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateRequiredPass implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_REQUIRED2.resolveFor(actor).isVisible();
    }
    public static Question validate(){
        return new ValidateRequiredPass();
    }
}