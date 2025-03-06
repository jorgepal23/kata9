package net.orangehrmlive.UI;

import net.serenitybdd.screenplay.targets.Target;

public class MenuUI {
    public static Target BTN_ADMIN_BUTTON =Target.the("Select the admin button").locatedBy("//span[text()='Admin']");
    public static Target BTN_ADD_BUTTON =Target.the("Select the add button").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    public static Target BTN_ROLE =Target.the("Select the user role").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]");
    public static Target TXT_ROLE =Target.the("Select the user role").locatedBy("//*[contains(text(),'Admin')]");
    public static Target BTN_STATUS =Target.the("Select the status").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i");
    public static Target TXT_STATUS =Target.the("Select the status").locatedBy("//*[contains(text(),'Enabled')]");
    public static Target BTN_USERNAME=Target.the("Select the username").locatedBy("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    public static Target BTN_PASSWORD =Target.the("Enter to password").locatedBy("//*[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//input");
    public static Target BTN_CONFIRMPASSWORD =Target.the("Enter the confirm password").locatedBy("//*[@class='oxd-grid-item oxd-grid-item--gutters']//input[@type='password']");
    public static Target BTN_EMPNAME=Target.the("Select the employee name").locatedBy("//input[@placeholder='Type for hints...']");
    public static Target TXT_EMPNAME=Target.the("Select the employee name").locatedBy(".//*[contains(text(),'" + "Orange  Test" + "')]");
    public static Target BTN_SAVE =Target.the("Click the save button").locatedBy("//button[@type='submit']");
    public static Target BTN_SEARCH_USERNAME =Target.the("Click the search username").locatedBy("//*[@class='oxd-grid-4 orangehrm-full-width-grid']//div//div//div//input[@class='oxd-input oxd-input--active']");
    public static Target BTN_SEARCH =Target.the("Click the search").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    public static Target BTN_EDIT =Target.the("Click the edit pencil").locatedBy("//button[@class='oxd-icon-button oxd-table-cell-action-space']//i[@class='oxd-icon bi-pencil-fill']");
    public static Target TXT_ROLEM =Target.the("Modify the role").locatedBy("//*[contains(text(),'ESS')]");
    public static Target TXT_STATUSM =Target.the("Modify the status").locatedBy("//*[contains(text(),'Disabled')]");
    public static Target BTN_CHANGE =Target.the("Change you password").locatedBy("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    public static Target BTN_DELETE =Target.the("Trash delete").locatedBy("//*[@class='oxd-icon bi-trash']");
    public static Target BTN_DELUSER =Target.the("Delete user").locatedBy("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
    public static Target LBL_DELETE =Target.the("Validate delete").locatedBy("//*[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']");
    public static Target LBL_MODIFY =Target.the("Validate modify").locatedBy("//*[contains(text(),'Disabled')]");
    public static Target LBL_ADD =Target.the("Validate add").locatedBy("//*[contains(text(),'Enabled')]");
}