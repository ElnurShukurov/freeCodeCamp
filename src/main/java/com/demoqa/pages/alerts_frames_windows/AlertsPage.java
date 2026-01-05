package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends Alerts_Frames_WindowsPage {

    private By informationAlertButton = By.id("alertButton");

    public void clickInformationAlertButton() {
        scrollToElementJS(informationAlertButton);
        click(informationAlertButton);
    }
}
