package com.greetgo.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.elements;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.greetgo.util.Randomizer;
import com.greetgo.data.TestsData;
import org.testng.annotations.Test;

public class TestSearch extends BaseTest {

    @Test(dataProvider = "Search Field Data Provider", dataProviderClass = TestsData.class)
    public void testSearch(String headerText, int randomStringLength, int numOfSearchResultsQuickViews) {
        Selenide.open(mainPage.getURL());
        getWebDriver().manage().window().maximize();

        mainPage.getSearchInputField()
                .shouldBe(Condition.visible);

        String randomString = Randomizer.getRandomString(randomStringLength);
        mainPage.getSearchInputField()
                .setValue(randomString)
                .pressEnter();
        searchResultPage.getSearchResultHeading()
                        .shouldBe(Condition.text(headerText));
        searchResultPage.getSearchInputFieldFillingText()
                        .shouldBe(Condition.attribute("value", randomString));
        searchResultPage.getSearchResultQuickView()
                        .shouldHave(CollectionCondition.sizeLessThanOrEqual(numOfSearchResultsQuickViews));
    }

}
