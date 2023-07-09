package com.greetgo.tests;

import static com.codeborne.selenide.Selenide.Wait;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.greetgo.data.TestsData;
import org.testng.annotations.Test;

public class TestLinkToMainPage extends BaseTest {

    @Test(dataProvider = "Link To Main Data Provider", dataProviderClass = TestsData.class)
    public void testLinkToMainPage(String pageTitle, String link) {
        Selenide.open(codeInspectPage.getURL());
        getWebDriver().manage().window().maximize();

        codeInspectPage.getLinkToMainPage().shouldHave(Condition.attribute("href", link));
        codeInspectPage.getBurgerMenu().click();
        codeInspectPage.getLinkToMainPage().click();
        Wait().until(titleIs(pageTitle));
    }
}
