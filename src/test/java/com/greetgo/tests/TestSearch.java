package com.greetgo.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestSearch extends BaseTest {

    @Test(/*dataProvider = "Search Field Data Provider", dataProviderClass = TestsData.class*/)
    public void testSearch(/*String headerText, int randomStringLength, int numOfSearchResultsQuickViews*/) {
        Selenide.open(mainPage.getURL());
        getWebDriver().manage().window().maximize();

        mainPage.getSearchInputField()
                .shouldBe(Condition.visible);

        //String randomString = Randomizer.getRandomString(randomStringLength);
        String searchInquiryString = "Хтонь";

        mainPage.getSearchInputField()
                .setValue(searchInquiryString)
                .pressEnter();
        searchResultPage.getSearchResultHeading()
                        .shouldBe(text("Результаты поиска"));
        searchResultPage.getSearchInputFieldFillingText()
                        .shouldBe(attribute("value", searchInquiryString));
        searchResultPage.getSearchResultQuickView()
                        .shouldHave(sizeGreaterThanOrEqual(20));
        searchResultPage.getSearchResultQuickViewsLinks()
                        .get(0)
                        .shouldHave(
                                attribute("href", "https://ru.wikipedia.org/wiki/%D0%A5%D1%82%D0%BE%D0%BD")
                        );

        for (SelenideElement e : searchResultPage.getSearchResultQuickViewsLinks()) {
                    e.shouldHave(
                            attribute("href")
                    );
        }


    }

}
