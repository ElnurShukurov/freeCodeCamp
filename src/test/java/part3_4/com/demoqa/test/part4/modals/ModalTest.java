package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var afwPage = homePage.gotoAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalTest();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The message does not contain 'small modal' \n");
        modalDialogsPage.clickCloseButton();
    }
}
