package net.orangehrmlive.questions;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateWelcomePage implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_INVALID.resolveFor(actor).isVisible();
    }
    public static Question <Boolean> validate(){
        return new ValidateWelcomePage();
    }
}