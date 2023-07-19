package com.greetgo.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class TestLanguageSwitch extends BaseTest {

    @Test
    public void testLanguageSwitch() {
        Selenide.open(articlePage.getURL());
        getWebDriver().manage().window().maximize();

        articlePage.getLanguageDropdown()
                    .click();
        articlePage.getLanguageRussianButton()
                    .shouldBe(visible)
                    .click();
        articlePage.getWikiLogoRussian()
                    .shouldBe(
                            attribute("title", "Перейти на заглавную страницу")
                    );

        webdriver().shouldHave(url(articlePage.getURL_RUS()));

        articlePage.getArticleTitle()
                    .shouldBe(text("Google (компания)"));

        articlePage.getMoreLangsButton().scrollIntoView(true).click();
        //todo получить весь список языкав скроллингом

        articlePage.getElementToScrollDown(35).scrollIntoView(true);

        for (SelenideElement e : articlePage.getAllLangsToChooseList()) {
            e.shouldNotBe(attribute("title", "Русский"));
        }
    }

}
