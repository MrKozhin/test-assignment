package com.greetgo.tests;

import static com.codeborne.selenide.Selenide.Wait;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class TestLanguageSwitch extends BaseTest {

    @Test
    public void testLanguageSwitch() {
        Selenide.open(articlePage.getURL());
        getWebDriver().manage().window().maximize();

        articlePage.getLanguageDropdown().click();
        Wait().until(visibilityOf(articlePage.getLanguageRussianButton()));
        articlePage.getLanguageRussianButton().click();
        articlePage.getWikiLogoRussian().shouldBe(Condition.attribute("title", "Перейти на заглавную страницу"));

    }

}
