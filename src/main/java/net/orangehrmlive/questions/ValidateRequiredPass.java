package net.orangehrmlive.questions;

import net.orangehrmlive.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateRequiredPass implements Question <Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_REQUIRED2.resolveFor(actor).isVisible();
    }
    public static Question <Boolean> validate(){
        return new ValidateRequiredPass();
    }
}