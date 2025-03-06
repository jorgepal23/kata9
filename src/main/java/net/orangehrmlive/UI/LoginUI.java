package net.orangehrmlive.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static Target INPUT_USER =Target.the("Enter user").located(By.name("username"));
    public static Target TXT_PASSWORD =Target.the("Enter password").located(By.name("password"));
    public static Target BUTTON_LOGIN =Target.the("Ingress").locatedBy("//button[@type='submit']");
    public static Target LBL_INVALID =Target.the("Invalid").locatedBy("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    public static Target LBL_REQUIRED =Target.the("RequiredUser").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
    public static Target LBL_REQUIRED2 =Target.the("RequiredPass").locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
    public static Target LBL_OK =Target.the("OkPass").locatedBy("//input[@placeholder='Search']");
}
