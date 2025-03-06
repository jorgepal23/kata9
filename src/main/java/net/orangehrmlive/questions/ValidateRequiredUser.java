package net.orangehrmlive.questions;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateRequiredUser implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_REQUIRED.resolveFor(actor).isVisible();
    }
    public static Question validate(){
        return new ValidateRequiredUser();
    }
}