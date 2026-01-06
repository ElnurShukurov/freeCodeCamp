package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends Alerts_Frames_WindowsPage {

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");

    public void clickInformationAlertButton() {
        scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        scrollToElementJS(confirmationAlertButton);
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton() {
        scrollToElementJS(promptAlertButton);
        click(promptAlertButton);
    }

    public String getPromptAlertResult() {
        return find(promptResult).getText();
    }
}
