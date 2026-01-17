package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Elnur Shukurov");
        textBoxPage.setEmail("shukurov@gmail.com");
        textBoxPage.setAddress("1234 Selenium Avenue");
        textBoxPage.setAddress("Suite 3400");
        textBoxPage.setAddress("Dallas, Texas");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 3400"),
                "\n Actual Address does not contain Suite 3400\n");
    }

}
