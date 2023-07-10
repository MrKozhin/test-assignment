package com.greetgo.tests;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class TestContents extends BaseTest {

    @Test
    public void testArticleContent() {
        Selenide.open(articlePage.getRandomURL());
        getWebDriver().manage().window().maximize();

        articlePage.getContents().shouldBe(Condition.visible);
        articlePage.getContents().shouldBe(Condition.text("Contents"));
        articlePage.getParagraphsContentsPanel().shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1));
    }
}
