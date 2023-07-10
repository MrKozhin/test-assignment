package com.greetgo.tests;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

public class TestParagraphs extends BaseTest {

    @Test
    public void testParagraphs() {
        Selenide.open(articlePage.getURL());
        getWebDriver().manage().window().maximize();

        for (SelenideElement element : articlePage.getParagraphsArticle()) {
            element.shouldBe(Condition.visible);
        }
        articlePage.getParagraphsContentsPanel()
                   .shouldBe(
                       CollectionCondition.size(articlePage.getParagraphsArticle().size() + 1)
                   );

    }
}
